abstract class pessoa{

private String nome;
private int altura;
private int idade;

public void setNome(String _nome){
nome = _nome;}
public void setAltura(int _altura){
altura = _altura;}
public void setidade(int _idade){
idade = _idade;}

public String getNome(){
return nome;}
public int getaltura(){
return altura;}
public int getIdade(){
return idade;}

void falar_nome(){
System.out.println("Nome :"+nome);}
void falar_altura(){
System.out.println("Altura :"+altura);}
void falar_idade(){
System.out.println("Idade :"+idade);}

}
class funci extends pessoa{
@Override
void falar_nome(){
System.out.println("Nome :"+ getNome());}

@Override
void falar_altura(){
System.out.println("Altura :"+ getaltura());}

@Override
void falar_idade(){
System.out.println("idade:"+ getIdade());}

}

class presidente extends pessoa{
@Override
void falar_nome(){
System.out.println("Nome :"+ getNome());}

@Override
void falar_altura(){
System.out.println("Altura :"+ getaltura());}

@Override
void falar_idade(){
System.out.println("idade:"+ getIdade());}
}




public class Main {

    
    public static void main(String[] args) {
        funci z = new funci();
        z.setNome("jose");
        z.setAltura(2);
        z.setidade(34);
        z.falar_nome();
        z.falar_altura();
        z.falar_idade();
        
        presidente q = new presidente();
        z.setNome("chico");
        z.setAltura(2);
        z.setidade(29);
        z.falar_nome();
        z.falar_altura();
        z.falar_idade();
        
    }
    
}
