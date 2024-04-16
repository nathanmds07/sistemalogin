
package br.ulbra.entity;

public class Usuario {
  private int pKIdUsu;
  private String nomeUsu;
   private String emailUsu;
    private String senhaUsu;
   
    public Usuario(){
     this.pKIdUsu = 1;
     this.nomeUsu = "xiruzão da Silva";
     this.emailUsu = "x@x.com";
     this.senhaUsu = "123";
    }

    public int getpKIdUsu() {
        return pKIdUsu;
    }

    public void setpKIdUsu(int pKIdUsu) {
        this.pKIdUsu = pKIdUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }
    @Override
    public String toString() {
        return "Usuario{" + "pkIdUusu=" + pKIdUsu + ", nomeUsu=" + nomeUsu + ", emailUsu=" + emailUsu + ", senhaUsu=" + senhaUsu + '}';
    
}
}