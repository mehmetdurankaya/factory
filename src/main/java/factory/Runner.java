package factory;

public class Runner {
    public static void main(String[] args) {
       Employe e1=new Employe("Mehmet Duran Kaya",52,1999,50000,46);
       Employe e2=new Employe("Nizamettin Kaya",48,2018,15000,19);
       Employe e3=new Employe("Sibel Kaya",50,2019,15000,40);
       Employe e4=new Employe("Ali Veli",40,2020,1000,19);

       e1.ToString();
       e2.ToString();
       e3.ToString();
       e4.ToString();

    }
}
