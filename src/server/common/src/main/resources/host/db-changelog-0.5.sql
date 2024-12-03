--liquibase formatted sql

--changeset dev:1
CREATE TABLE host
(
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    name        text,
    cpu         INTEGER,
    memory      INTEGER,
    storage     INTEGER,
    uuid        varchar(36)  not null,
    status      varchar(100) not null,
    ip_address  TEXT,
    system_info TEXT
);
CREATE TABLE storage
(
    id                INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid              varchar(36)  not null,
    name              varchar(100) not null,
    capacity_in_bytes INTEGER      not null,
    free_in_bytes     INTEGER      not null,
    storage_type      varchar(255) not null,
    url               varchar(255) not null,
    mounted_path      varchar(1024),
    assigned          BOOLEAN DEFAULT false
);
CREATE TABLE network
(
    id           INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid         varchar(36)  not null,
    name         varchar(100) not null,
    network_type varchar(255) not null,
    ip_addresses text
);
CREATE TABLE disk
(
    id         INTEGER PRIMARY KEY AUTOINCREMENT,
    uuid       varchar(36) not null,
    storage_id INTEGER     not null,
    vm_id      varchar(36) not null,
    path       TEXT
);
CREATE TABLE virtual_machine
(
    id              INTEGER PRIMARY KEY AUTOINCREMENT,
    name            varchar(255) not null,
    uuid            varchar(36)  not null,
    status          varchar(16)  not null,
    managed_status  varchar(16),
    cpu             INTEGER      not null,
    memory_in_mb    INTEGER      not null,
    disk_size_in_gb INTEGER      not null,
    agent_installed INTEGER      not null default 0,
    guest_os_type   varchar(24),
    ip_addresses    TEXT,
    config          TEXT         not null,
    vnc             TEXT
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