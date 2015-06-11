package mortalkombat;

public class Kitana {
    
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
    public Kitana()
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
    public String fan_toss()
    {
        return "Frente, frente, "+socobaixo;
    }
    
    public String fan_lift()
    {
        return "Atrás, atrás, atrás, "+socoalto;  
    }
    
    public String square_wave_punch()
    {
        return "Baixo, atrás, "+socoalto;
    }
    
    public String swipe()
    {
      return "Atrás" + socoalto;  
    }
    public String combo1()
    {
      return chutealto + ", " + chutealto + ", " + chutealto + ", " + chutealto;   
    }
    
    public String combo2()
    {
        return socoalto + ", " + socoalto + ", " + socoalto + ", " + chutealto + ", " + chutealto + ", " + chutealto + ", " + chutealto;
    }
    
    public String combo3()
    {
        return chutealto + ", " + chutealto + ", " + socoalto + ", " + socoalto + ", " + socoalto;
    }
    public String fatality1()
    {
        return "Frente, baixo, frente, "+chutealto + "\t (A um passo do inimigo)";
    }
    public String fatality2()
    {
        return "Baixo, cima, baixo, cima, atrás \t (A um passo do inimigo)";
    }
    private String Animality()
    {
        return "Baixo, Baixo, Baixo, Correr \t(A um passo do inimigo)";
    }
}

