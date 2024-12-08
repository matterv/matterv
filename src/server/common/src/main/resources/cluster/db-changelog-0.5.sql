--liquibase formatted sql

--changeset dev:1
CREATE TABLE data_center
(
    id         INTEGER PRIMARY KEY AUTOINCREMENT,
    name       text,
    uuid       varchar(36) not null,
    is_deleted BOOLEAN DEFAULT false,
    is_gced    BOOLEAN DEFAULT false,
    updated_at start_time
);
CREATE TABLE compute_cluster
(
    id         INTEGER PRIMARY KEY AUTOINCREMENT,
    name       text,
    uuid       varchar(36) not null,
    is_deleted BOOLEAN DEFAULT false,
    is_gced    BOOLEAN DEFAULT false,
    updated_at start_time
);
CREATE TABLE host
(
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    name        text,
    cpu         INTEGER,
    memory      INTEGER,
    storage     INTEGER,
    uuid        varchar(36)  not null UNIQUE,
    host_uuid   varchar(36) UNIQUE,
    status      varchar(100) not null,
    ip_address  TEXT,
    system_info TEXT,
    endpoint    TEXT,
    is_deleted  BOOLEAN DEFAULT false,
    is_gced     BOOLEAN DEFAULT false,
    updated_at  start_time
);
CREATE TABLE storage
(
    id                INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid              varchar(36)  not null,
    uuid_on_host      varchar(36) UNIQUE,
    host_uuid         varchar(36)  not null,
    name              varchar(100) not null,
    capacity_in_bytes INTEGER      not null,
    free_in_bytes     INTEGER      not null,
    storage_type      varchar(255) not null,
    url               varchar(255) not null,
    mounted_path      varchar(1024),
    assigned          BOOLEAN DEFAULT false,
    is_deleted        BOOLEAN DEFAULT false,
    is_gced           BOOLEAN DEFAULT false,
    status            varchar(100) not null,
    updated_at        start_time
);
CREATE TABLE network
(
    id           INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid         varchar(36)  not null,
    uuid_on_host varchar(36) UNIQUE,
    host_uuid    varchar(36)  not null,
    name         varchar(100) not null,
    network_type varchar(255) not null,
    ip_addresses text,
    is_deleted   BOOLEAN DEFAULT false,
    is_gced      BOOLEAN DEFAULT false,
    assigned     BOOLEAN DEFAULT false,
    updated_at   start_time
);
CREATE TABLE disk
(
    id            INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid          varchar(36) not null,
    disk_order    INTEGER     not null,
    vm_id         varchar(36) not null,
    storage_id    varchar(36) not null,
    size_in_bytes INTEGER     not null,
    path          TEXT,
    is_deleted    BOOLEAN DEFAULT false,
    is_gced       BOOLEAN DEFAULT false,
    updated_at    start_time
);
CREATE TABLE virtual_machine
(
    id              INTEGER PRIMARY KEY AUTOINCREMENT,
    name            varchar(255) not null,
    uuid            varchar(36)  not null,
    uuid_on_host    varchar(36) UNIQUE,
    host_uuid       varchar(36)  not null,
    status          varchar(16)  not null,
    cpu             INTEGER      not null,
    memory_in_bytes INTEGER      not null,
    agent_installed INTEGER      not null default 0,
    guest_os_type   varchar(24),
    ip_addresses    TEXT,
    config          TEXT         not null,
    vnc             TEXT,
    is_deleted      BOOLEAN               DEFAULT false,
    is_gced         BOOLEAN               DEFAULT false,
    updated_at      start_time
);

CREATE TABLE job
(
    id         INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid       varchar(36)  not null,
    object_id  varchar(36)  not null,
    type       varchar(255) not null,
    progress   TEXT,
    config     TEXT         not null,
    status     varchar(24)  not null,
    start_time INTEGER      not null,
    end_time   INTEGER,
    frequency  INTEGER
);
CREATE TABLE user
(
    id       INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid     varchar(36) not null,
    name     text        not null,
    password text        not null
);
CREATE TABLE node
(
    uuid varchar(36) not null PRIMARY KEY,
    type TEXT        NOT NULL
);

CREATE TABLE node_relationship
(
    parent_uuid varchar(36),
    child_uuid  varchar(36),
    PRIMARY KEY (parent_uuid, child_uuid),
    FOREIGN KEY (parent_uuid) REFERENCES node (uuid),
    FOREIGN KEY (child_uuid) REFERENCES node (uuid)
);
CREATE INDEX idx_node_relationship_parent_uuid ON node_relationship (parent_uuid);
CREATE INDEX idx_node_relationship_child_uuid ON node_relationship (child_uuid);

CREATE VIEW get_descendants AS
WITH RECURSIVE descendants(uuid, type, depth, root_uuid) AS (SELECT uuid, type, 0, uuid
                                                             FROM node
                                                             UNION ALL
                                                             SELECT n.uuid, n.type, d.depth + 1, d.root_uuid
                                                             FROM node n
                                                                      JOIN node_relationship nr ON n.uuid = nr.child_uuid
                                                                      JOIN descendants d ON nr.parent_uuid = d.uuid
                                                             WHERE d.depth < 10)
SELECT uuid, type, depth, root_uuid
FROM descendants;

CREATE VIEW get_ancestors AS
WITH RECURSIVE ancestors(uuid, type, depth, leaf_uuid) AS (SELECT uuid, type, 0, uuid
                                                           FROM node
                                                           UNION ALL
                                                           SELECT n.uuid, n.type, a.depth + 1, a.leaf_uuid
                                                           FROM node n
                                                                    JOIN node_relationship nr ON n.uuid = nr.parent_uuid
                                                                    JOIN ancestors a ON nr.child_uuid = a.uuid
                                                           WHERE a.depth < 10)
SELECT uuid, type, depth, leaf_uuid
FROM ancestors;
