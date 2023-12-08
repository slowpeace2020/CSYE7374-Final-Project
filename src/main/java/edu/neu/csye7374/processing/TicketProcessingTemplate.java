package edu.neu.csye7374.processing;

public abstract class TicketProcessingTemplate {
    // 模板方法，定义了处理票务的步骤
    public final void processTicket() {
        stepOne();
        stepTwo();
        stepThree();
        finalizeTicket();
    }

    abstract void stepOne();
    abstract void stepTwo();
    abstract void stepThree();

    // 最后的步骤可以是通用的，也可以被子类覆盖
    void finalizeTicket() {
        System.out.println("Finalizing ticket process.");
    }
}

