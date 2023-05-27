import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Farmaceutico {
    private String CPF;
    private String nome;
    private String senha;
    private boolean admin;

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
        try {
            // Verifica se o CPF possui exatamente 11 caracteres numéricos
            if (Pattern.matches("^\\d{11}$", CPF)) {
                this.CPF = CPF;
            } else {
                throw new IllegalArgumentException("O CPF deve ter 11 caracteres numéricos!");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //this.CPF = null; // Cancela a operação
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
        try {
            // Verifica se a senha possui entre 9 e 11 caracteres alfanuméricos
            if (senha.length() >= 9 && senha.length() <= 11) {
                this.senha = senha;
            } else {
                throw new IllegalArgumentException("A senha deve ter entre 9 e 11 caracteres!");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //this.senha = null; // Cancela a operação
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}