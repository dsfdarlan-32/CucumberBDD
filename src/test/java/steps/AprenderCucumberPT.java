package steps;
import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumberPT {
  private Integer contador = 0;
  
  @Dado("que criei o arquivo corretamente")
  public void queCrieiOArquivoCorretamente() {
  }
  
  @Quando("executa lo")
  public void executaLo() {
  }
  
  @Entao("a especificacao deve finaliuzar com sucesso")
  public void aEspecificacaoDeveFinaliuzarComSucesso() {
  }
  
  @Dado("que o valor do contador e {int}")
  public void queOValorDoContadorE(Integer int1) {
    contador = int1;
  }
  
  @Quando("eu incremnetar em {int}")
  public void euIncremnetarEm(Integer int1) {
    contador += int1;
  }
  
  @Entao("o valor do contador sera {int}")
  public void oValorDoContadorSera(Integer int1) {
    Assert.assertEquals(int1, contador);
  }
}