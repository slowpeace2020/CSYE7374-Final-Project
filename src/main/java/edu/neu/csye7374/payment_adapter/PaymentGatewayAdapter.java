package edu.neu.csye7374.payment_adapter;

/**
 * @ClassName PaymentGatewayAdapter
 * @Description TODO
 * @Author Panzi
 * @Date 2023/12/8 14:46
 * @Version 1.0
 */
public class PaymentGatewayAdapter implements PaymentGateway {
    private ExternalPaymentGateway externalPaymentGateway;

    public PaymentGatewayAdapter(ExternalPaymentGateway externalPaymentGateway) {
        this.externalPaymentGateway = externalPaymentGateway;
    }

    @Override
    public void processPayment(String paymentDetails) {
        // 调用被适配的类的方法
        externalPaymentGateway.performExternalPayment(paymentDetails);
    }
}
