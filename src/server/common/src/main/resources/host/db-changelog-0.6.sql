--liquibase formatted sql

--changeset dev:1

ALTER TABLE virtual_machine ADD COLUMN os_id INTEGER NOT NULL DEFAULT 2;
