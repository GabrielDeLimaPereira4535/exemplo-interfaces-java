public class Main {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE NOTIFICAÇÕES =====");
        System.out.println();

        Notificacao email = new EmailNotificacao();

        ServicoNotificacao servicoEmail =
                new ServicoNotificacao(email);

        servicoEmail.enviarMensagem(
                "Sua conta foi criada com sucesso!"
        );

        System.out.println();

        Notificacao sms = new SmsNotificacao();

        ServicoNotificacao servicoSms =
                new ServicoNotificacao(sms);

        servicoSms.enviarMensagem(
                "Seu código de confirmação é 1234."
        );
    }
}
