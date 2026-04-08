public interface Pagamento{
    void autorizar(double valor);

    void exibirComprovante();
}