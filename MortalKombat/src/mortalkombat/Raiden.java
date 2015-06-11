
package mortalkombat;

public class Raiden {

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

    public Raiden()
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

    public String lightning()
    {
        return "Baixo, frente, "+socobaixo;
    }
    
    public String reverse_lightning()
    {
        return "Baixo, atrás" + socobaixo;  
    }
    
    public String superman()
    {
        return "Atrás, atrás, frente \t(Funciona no ar) ";
    }
    
    public String shoker()
    {
      return "Pressione o: " + socoalto +" Por três segundos e solte (ao lado do inimigo)";  
    }
    
    public String teleport()
    {
      return "Baixo, Cima";  
    }
    
    public String combo1()
    {
      return chutealto + ", " + chutealto + ", atrás, " + chutealto;   
    }
    
    public String combo2()
    {
        return socoalto + ", " + socoalto + ", " + socoalto + ", " + chutealto + ", " + chutealto;
    }
    
    public String combo3()
    {
        return chutealto + ", " + chutealto + ", " + socoalto + ", " + socoalto + ", " + socoalto + ", " + socoalto + ", " + socoalto;
    }

    public String fatality1()
    {
        return "Frente, frente, "+socobaixo;
    }

     private String joga_chapeu()
    {
        return "baixo, baixo, cima, " + chutealto + socobaixo;
    }
}

