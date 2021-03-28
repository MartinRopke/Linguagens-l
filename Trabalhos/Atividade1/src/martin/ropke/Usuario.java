package martin.ropke;



public class Usuario {
    private String nome;
    private String senha;
    private String email;

    Usuario(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;

    }

    //retorna o nome do usuario
    public String getNome(){
        return this.nome;
    }

    //retorna a senha do usuario
    public String getSenha(){
        return this.senha;
    }

    //retorna o email do usuario
    public String getEmail(){
        return this.email;
    }

    //verifica se a senha e o email do usuario estão corretos
    public boolean verificarUsuario(String senha, String email){
        if(senha.equals(this.senha) && email.equals(this.email)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        
        return "nome:"+nome+" senha:" + senha+" email:" + email;
    }
    
}
