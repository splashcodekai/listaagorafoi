import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        List<String>listaHomem=new ArrayList();
        List<String>listaMulher=new ArrayList();
        String c;
        String u;
        boolean a=true;
        System.out.println("Vamos criar uma lista que vai ser diferencial pelo genero");
        System.out.println("Exemplo:(Kaik-M) voce ira utilizar o '-' para falar o genero");
        System.out.println("DIGITE 'sair' PARA PARAR O PROCESSO, Bora la?:");
        c=s.nextLine();

        if(c.equalsIgnoreCase("Sim")){
            while(a==true){
                System.out.println("Digite o nome da pessoa e o genero, como no exemplo acima");
                u=k.nextLine();

                if(u.equalsIgnoreCase("sair")){
                    Collections.sort(listaHomem);
                    Collections.sort(listaMulher);
                    System.out.println("Lista de Homens:"+listaHomem);
                    System.out.println("Lista de Mulheres"+listaMulher);

                    a=false;
                }
                else{
                    String m[]=u.split("-");

                    if(m.length==2){
                        String nome1=m[0];
                        String separa=m[1];

                        if(separa.equalsIgnoreCase("M")){
                            Collections.sort(listaHomem);
                            listaHomem.add(nome1);
                        }
                        if(separa.equalsIgnoreCase("F")){
                            Collections.sort(listaMulher);
                            listaMulher.add(nome1);
                        }

                    }



                }
            }
        }
    }
}