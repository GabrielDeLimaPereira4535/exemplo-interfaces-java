public class SmsNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS...");
        System.out.println("Mensagem: " + mensagem);
    }

}
