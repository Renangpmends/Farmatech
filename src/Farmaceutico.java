import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Farmaceutico {
    private String CPF;
    private String nome;
    private String senha;
    private boolean admin;
    //testeteste
    public static void main(String[] args) {
        // Exemplo de uso
        Farmaceutico farmaceutico = new Farmaceutico();
        farmaceutico.setCPF(JOptionPane.showInputDialog("Informe o CPF do Farmaceutico:"));
        farmaceutico.setSenha(JOptionPane.showInputDialog("Informe a Senha do Farmaceutico:"));

        if (farmaceutico.getCPF() != null && farmaceutico.getSenha() != null) {
            JOptionPane.showMessageDialog(null, "Farmaceutico:\n" +
                    "CPF: " + farmaceutico.getCPF() + "\n" +
                    "Senha: " + farmaceutico.getSenha());
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        // Verifica se o CPF possui apenas 1 caractere numérico
        if (Pattern.matches("^\\d{1}$", CPF)) {
            this.CPF = CPF;
        } else {
            JOptionPane.showMessageDialog(null, "O CPF deve ter apenas 1 caractere numérico!");
            this.CPF = null; // Cancela a operação
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        // Verifica se a senha possui no máximo 9 caracteres alfanuméricos
        if (Pattern.matches("^[a-zA-Z0-9]{0,9}$", senha)) {
            this.senha = senha;
        } else {
            JOptionPane.showMessageDialog(null, "A senha deve ter no máximo 9 caracteres alfanuméricos!");
            this.senha = null; // Cancela a operação
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
