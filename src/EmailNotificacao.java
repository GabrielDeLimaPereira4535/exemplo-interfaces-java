public class EmailNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail...");
        System.out.println("Mensagem: " + mensagem);
    }

}
