package structural.facade;

public interface ComputerPart {

    interface Memory {
        void load(long position, byte[] data);
    }

    interface HardDrive {
        void read(long lba, int size);
    }

    interface Cpu {
        public void freeze();
        public void jump(long position);
        public void execute();
    }

}
