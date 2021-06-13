package structural.facade;

class ComputerImpl implements ComputerFacade{

    private final ComputerPart.Cpu cpu;
    private final ComputerPart.Memory memory;
    private final ComputerPart.HardDrive hardDrive;

    public ComputerImpl() {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(0, new byte[]{0});
        cpu.jump(0);
        cpu.execute();
        hardDrive.read(0, 10);
    }
}
