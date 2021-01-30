package HomeWork01;

public class Team {

   private final String nameTeam;
   SportActivity team[] = new SportActivity[4];

   public Team (String nameTeam){
       this.nameTeam = nameTeam;
       team[0] = new Robot("Валли",50,100);
       team[1] = new Cat("Гарфилд",10,50);
       team[2] = new Human("Иван", 2,100);
       team[3] = new Robot("Ееввва",100,100);
   }

    public SportActivity[] getTeam() {
        return team;
    }
}
