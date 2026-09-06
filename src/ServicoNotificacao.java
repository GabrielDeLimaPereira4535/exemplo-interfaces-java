public class ServicoNotificacao {

    private Notificacao notificacao;

    public ServicoNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarMensagem(String mensagem) {
        notificacao.enviar(mensagem);
    }

}
