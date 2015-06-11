
package mortalkombat;

public class KungLao {

    private String socoalto;
    private String socobaixo;
    private String chutealto;
    private String chutebaixo;
    private String defesa;
    private String agarra;
    private String especial;
    private Integer vida;
    
    
    public Integer getVida() {    
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getSocoalto() {
        return socoalto;
    }

    public void setSocoalto(String socoalto) {
        this.socoalto = socoalto;
    }

    public String getSocobaixo() {
        return socobaixo;
    }

    public void setSocobaixo(String socobaixo) {
        this.socobaixo = socobaixo;
    }

    public String getChutealto() {
        return chutealto;
    }

    public void setChutealto(String chutealto) {
        this.chutealto = chutealto;
    }

    public String getChutebaixo() {
        return chutebaixo;
    }

    public void setChutebaixo(String chutebaixo) {
        this.chutebaixo = chutebaixo;
    }

    public String getDefesa() {
        return defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
    public KungLao()
    {
        this.agarra = null;
        this.chutealto = null;
        this.chutebaixo = null;
        this.defesa = null;
        this.especial = null;
        this.socoalto = null;
        this.socobaixo = null;
        this.vida = 100;
    }
 
    public String hat_toss()
    {
        return "Atrás, frente, "+socobaixo;
    }
    
    public String drop_kick()
    {
        return "Baixo, "+chutealto+"\t(no ar)";  
    }
    
    public String spin()
    {
        return "Frente, baixo, frente, "+chutebaixo;
    }
    
    public String teleport()
    {
      return "Baixo, Cima";  
    }

    public String combo1()
    {
      return chutealto + ", " + chutealto + ", " + chutealto + ", " + chutealto;   
    }
    
    public String combo2()
    {
        return socoalto + ", " + socoalto + ", " + socoalto + ", " + socoalto + ", " + chutealto + ", " + chutealto + ", " + chutealto + ", " + chutealto;
    }
    
    public String combo3()
    {
        return chutealto + ", " + chutebaixo + ", " + socobaixo + ", " + socoalto + ", " + socoalto;
       
    }
    public String fatality1()
    {
        return "Atrás, Cima, Atrás, "+chutebaixo + socoalto;
    }
    public String fatality2()
    {
        return "Cima, cima, cima, baixo, atrás";
    }
     private String matalogo_ality()
    {
        return "Baixo, Baixo, Baixo, Baixo, Cima, Cima, Cima, Meia lua pra direita \t(A um passo do inimigo)";
    }
}

