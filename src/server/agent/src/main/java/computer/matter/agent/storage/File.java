package computer.matter.agent.storage;

import computer.matter.host.model.CreateFileReq;

public record File(String name, CreateFileReq.TypeEnum type) {
}
