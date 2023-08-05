
package aula003;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Aula003 {

 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        List<Employee> list = new ArrayList<>(); // criando uma lista ou instaciando
        
        System.out.println("Qunatos funcionarios vai cadastrar ?");
        int n = s.nextInt();
        s.nextLine(); //ler quebra de linha
           for (int i = 0; i < n; i++) {
               System.out.println("Digite o ID " + (i+1) + "ª funcionario");
                int id = s.nextInt();
                s.nextLine();
                
               System.out.println("Digite o nome do " + (i+1) +"ª funcionario");
               String name = s.nextLine();
             
               
               System.out.println("Digite o salario do " + (i + 1) + "ªfuncionario");
               double salary = s.nextDouble();
               s.nextLine();
               
               Employee funcionario = new Employee(id,name,salary);
               list.add(funcionario);
        }
           System.out.println("Qual Funcionario quer aumentar o salario digite ID: ");
           int idSalary = s.nextInt();
           Integer pos = position(list, idSalary); // recebe a lista e id como parametros
            if (pos == null) {
                System.out.println("esse id nao existe");
        }
            else{
                System.out.println("Digite a porcetagem do salario: ");
                double percent = s.nextDouble();
                s.nextLine();
                list.get(pos).incresseeSalary(percent);
            }
           
           
        System.out.println("lista de funcionarios");
           for(Employee fun : list){
               System.out.println("----------------");
               System.out.println("ID : " + fun.getId());
               System.out.println("nome: " + fun.getName());
               System.out.println("Salario : " + fun.getSalary());
               System.out.println("---------------------------");
           
           }
        
        //desaloca memoria
        s.close();
    }
    // funcoes e procediementos
    // percorrendo a lista inteira 
     public static Integer position(List<Employee> list, int id){
         for (int i = 0; i < list.size(); i++) {
             
             if(list.get(i).getId() == id){
               return i;
             }
             
         }
         return null;
     }
      
    
}
