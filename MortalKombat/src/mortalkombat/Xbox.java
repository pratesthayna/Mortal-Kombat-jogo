package mortalkombat;

public class Xbox {
    
    public static void main(String[] args) {
     
        
        Kitana p4 = new Kitana();

        
        p4.setAgarra("LT");
        p4.setChutebaixo("B");
        p4.setChutealto("Y");
        p4.setSocoalto("X");
        p4.setSocobaixo("A");
        p4.setDefesa("RT");
        p4.setEspecial("LB + RB");

        System.out.println("\tConfiguração dos Botões Kitana");
        System.out.println("\n");
        System.out.println("Agarra: \t" +p4.getAgarra());
        System.out.println("Soco Alto:  \t"  +p4.getSocoalto());
        System.out.println("Soco Baixo: \t" +p4.getSocobaixo());
        System.out.println("Chute Alto: \t" +p4.getChutealto());
        System.out.println("Chute Baixo: \t" +p4.getChutebaixo());
        System.out.println("Defesa: \t" +p4.getDefesa());
        System.out.println("Especial: \t" +p4.getEspecial());
        System.out.println("\n");
        
        System.out.println("\tComandos Especiais Kitana");
        System.out.println("\n");
        System.out.println("Fan Toss: \t\t\t" +p4.fan_toss());
        System.out.println("Fan Lift: \t"+p4.fan_lift());
        System.out.println("Square Wave Punch: \t\t"+p4.square_wave_punch());
        System.out.println("Swipe: \t\t" +p4.swipe());
        System.out.println("\n");
        
        System.out.println("\tCombos Kitana");
        System.out.println("\n");
        System.out.println("Combo 1: \t"+p4.combo1());
        System.out.println("Combo 2: \t" +p4.combo2());
        System.out.println("Combo 3: \t"+p4.combo3());
        System.out.println("\n");
        
        System.out.println("\tFATALITY's Kitana");
        System.out.println("\n");
        System.out.println("Fatality 1: \t" +p4.fatality1());
        System.out.println("Fatality 2: \t"  +p4.fatality2());
        System.out.println("\n");
    
        System.out.println("\tDLC's Kitana");
        System.out.println("\n");
        
        Reptile p1 = new Reptile();

        p1.setAgarra("LT");
        p1.setChutebaixo("B");
        p1.setChutealto("Y");
        p1.setSocoalto("X");
        p1.setSocobaixo("A");
        p1.setDefesa("RT");
        p1.setEspecial("LB + RB");

        System.out.println("\tConfiguração dos Botões Reptile");
        System.out.println("\n");
        System.out.println("Agarra: \t"+p1.getAgarra());
        System.out.println("Soco Alto:  \t"+p1.getSocoalto());
        System.out.println("Soco Baixo: \t"+p1.getSocobaixo());
        System.out.println("Chute Alto: \t"+p1.getChutealto());
        System.out.println("Chute Baixo: \t"+p1.getChutebaixo());
        System.out.println("Defesa: \t" +p1.getDefesa());
        System.out.println("Especial: \t"+p1.getEspecial());
        System.out.println("\n");
        
        System.out.println("\tComandos Especiais Reptile");
        System.out.println("\n");
        System.out.println("Ácido: \t\t\t" +p1.acid_spit());
        System.out.println("Fast Forceball: \t" +p1.fast_forceball());
        System.out.println("Slow Forceball: \t" +p1.slow_forceball());
        System.out.println("Slide: \t\t\t"  +p1.slide());
        System.out.println("Invisivel: \t\t" +p1.invisibility());
        System.out.println("Run and Elbow: \t\t"+p1.run_and_elbow());
        System.out.println("\n");
        
        System.out.println("\tCombos Reptile");
        System.out.println("\n");
        System.out.println("Combo 1: \t" +p1.combo1());
        System.out.println("Combo 2: \t"+p1.combo2());
        System.out.println("Combo 3: \t"+p1.combo3());
        System.out.println("\n");
        
        System.out.println("\tFATALITY's Reptile");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"+p1.fatality1());
        System.out.println("Fatality 2: \t"+p1.fatality2());
        System.out.println("\n");
    
        System.out.println("\tDLC's Reptile");
        System.out.println("\n");
 
        
        Raiden p6 = new Raiden();

        p6.setAgarra("LT");
        p6.setChutebaixo("B");
        p6.setChutealto("Y");
        p6.setSocoalto("X");
        p6.setSocobaixo("A");
        p6.setDefesa("RT");
        p6.setEspecial("LB + RB");
 
        System.out.println("\tConfiguração dos Botões Raiden");
        System.out.println("\n");
        System.out.println("Agarra: \t"  +p6.getAgarra());
        System.out.println("Soco Alto:  \t" +p6.getSocoalto());
        System.out.println("Soco Baixo: \t" +p6.getSocobaixo());
        System.out.println("Chute Alto: \t" +p6.getChutealto());
        System.out.println("Chute Baixo: \t"  +p6.getChutebaixo());
        System.out.println("Defesa: \t" +p6.getDefesa());
        System.out.println("Especial: \t" +p6.getEspecial());
        System.out.println("\n");
        
        System.out.println("\tComandos Especiais Raiden");
        System.out.println("\n");
        System.out.println("Lightning: \t\t\t" +p6.lightning());
        System.out.println("Reverse Lightning: \t"+p6.reverse_lightning());
        System.out.println("Superman: \t\t" +p6.superman());
        System.out.println("Shocker: \t\t" +p6.shoker());
        System.out.println("Teleport: \t\t" +p6.teleport());
        System.out.println("\n");
        
        System.out.println("\tCombos Kung Lao");
        System.out.println("\n");
        System.out.println("Combo 1: \t"          +p6.combo1());
        System.out.println("Combo 2: \t"          +p6.combo2());
        System.out.println("Combo 3: \t"          +p6.combo3()); 
        System.out.println("\n");
        
        System.out.println("\tFATALITY's Raiden");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +p6.fatality1());
        System.out.println("\n");
    
        System.out.println("\tDLC's Raiden");
        System.out.println("\n");

        System.out.println("\n\tLUTA Reptile x Kitana");
        LutaReptileKitana lut1 = new LutaReptileKitana();
        lut1.setCenario("Banheiro Público");
        lut1.setPersonagem1(p1); 
        lut1.setPersonagem2(p4);
        
         KungLao p5 = new KungLao();

        p5.setAgarra("LT");
        p5.setChutebaixo("B");
        p5.setChutealto("Y");
        p5.setSocoalto("X");
        p5.setSocobaixo("A");
        p5.setDefesa("RT");
        p5.setEspecial("LB + RB");

        System.out.println("\tConfiguração dos Botões Kung Lao");
        System.out.println("\n");
        System.out.println("Agarra: \t" +p5.getAgarra());
        System.out.println("Soco Alto:  \t" +p5.getSocoalto());
        System.out.println("Soco Baixo: \t" +p5.getSocobaixo());
        System.out.println("Chute Alto: \t"+p5.getChutealto());
        System.out.println("Chute Baixo: \t"+p5.getChutebaixo());
        System.out.println("Defesa: \t"+p5.getDefesa());
        System.out.println("Especial: \t"  +p5.getEspecial());
        System.out.println("\n");
        
        System.out.println("\tComandos Especiais Kung Lao");
        System.out.println("\n");
        System.out.println("Hat Toss: \t\t\t" +p5.hat_toss());
        System.out.println("Drop Kick: \t" +p5.drop_kick());
        System.out.println("Spin: \t\t" +p5.spin());
        System.out.println("Teleport: \t\t" +p5.teleport());
        System.out.println("\n");
        
        System.out.println("\tCombos Kung Lao");
        System.out.println("\n");
        System.out.println("Combo 1: \t" +p5.combo1());
        System.out.println("Combo 2: \t" +p5.combo2());
        System.out.println("Combo 3: \t" +p5.combo3()); 
        System.out.println("\n");
        
        System.out.println("\tFATALITY's Kung Lao");
        System.out.println("\n");
        System.out.println("Fatality 1: \t"       +p5.fatality1());
        System.out.println("Fatality 2: \t"       +p5.fatality2());
        System.out.println("\n");
    
        System.out.println("\tDLC's Kung Lao");
        System.out.println("\n");
        
        
                lut1.AcertaGolpe("p1");
        System.out.println("\n\tPersonagem 1 - Acertou Golpe");
        System.out.println("\nReptile(Personagem1): "+lut1.getPersonagem1().getVida()
                    + "\nKitana(Personagem2): "+lut1.getPersonagem2().getVida());
        
        
        lut1.AcertaCombo("p2");
        System.out.println("\n\tPersonagem 2 - Acertou Combo");
        System.out.println("\nKitana(Personagem2): "+lut1.getPersonagem2().getVida()
                    + "\nReptile(Personagem1): "+lut1.getPersonagem1().getVida());
        
        lut1.AcertaCombo2("p2");
        System.out.println("\n\tPersonagem 2 - Acertou Combo1");
        System.out.println("\nKitana(Personagem2): "+lut1.getPersonagem2().getVida()
                    + "\nReptile(Personagem1): "+lut1.getPersonagem1().getVida());
       
        System.out.println("\n\tLUTA Kung Lao x Raiden");
        LutaKunglaoRaiden lut2 = new LutaKunglaoRaiden();
        lut2.setCenario("Cozinha com Louça Suja");
        lut2.setPersonagem1(p5);  
        lut2.setPersonagem2(p6); 
        
        
                
                lut2.AcertaGolpe("p6");
        System.out.println("\n\tPersonagem 2 - Acertou Golpe");
        System.out.println("\nRaiden(Personagem2): "+lut2.getPersonagem2().getVida()
                    + "\nKung Lao(Personagem1): "+lut1.getPersonagem1().getVida());
        
                lut2.AcertaGolpe13("p6");
        System.out.println("\n\tPersonagem 2 - Acertou Golpe");
        System.out.println("\nRaiden(Personagem2): "+lut2.getPersonagem2().getVida()
                    + "\nKung Lao(Personagem1): "+lut1.getPersonagem1().getVida());
        
        lut2.AcertaCombo2("p6");
        System.out.println("\n\tPersonagem 2 - Acertou Golpe");
        System.out.println("\nRaiden(Personagem2): "+lut2.getPersonagem2().getVida()
                    + "\nKung Lao(Personagem1): "+lut1.getPersonagem1().getVida());
        
        lut2.AcertaCombo2("p5");
        System.out.println("\n\tPersonagem 1 - Acertou Golpe");
        System.out.println("\nKungLao(Personagem1): "+lut2.getPersonagem1().getVida()
                    + "\nRaiden(Personagem2): "+lut1.getPersonagem2().getVida());
        
    }   
    
}
