import javax.swing.JOptionPane;
public class Main {

    private static Farmaceutico farmaceutico;
    private static Prescritor prescritor;
    private static Medicamento medicamento;

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1. CRUD Farmaceutico\n" +
                            "2. CRUD Prescritor\n" +
                            "3. CRUD Medicamento\n" +
                            "0. Sair"
            ));

            switch (opcao) {
                case 1:
                    crudFarmaceutico();
                    break;
                case 2:
                    crudPrescritor();
                    break;
                case 3:
                    crudMedicamento();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static void crudFarmaceutico() {
        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1. Criar Farmaceutico\n" +
                            "2. Exibir Farmaceutico\n" +
                            "3. Atualizar Farmaceutico\n" +
                            "4. Deletar Farmaceutico\n" +
                            "0. Voltar"
            ));

            switch (opcao) {
                case 1:
                    criarFarmaceutico();
                    break;
                case 2:
                    exibirFarmaceutico();
                    break;
                case 3:
                    atualizarFarmaceutico();
                    break;
                case 4:
                    deletarFarmaceutico();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Voltando ao menu principal...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static void criarFarmaceutico() {
        farmaceutico = new Farmaceutico();

        farmaceutico.setCPF(JOptionPane.showInputDialog("Informe o CPF do Farmaceutico:"));
        farmaceutico.setNome(JOptionPane.showInputDialog("Informe o Nome do Farmaceutico:"));
        farmaceutico.setSenha(JOptionPane.showInputDialog("Informe a Senha do Farmaceutico:"));
        farmaceutico.setAdmin(Boolean.parseBoolean(JOptionPane.showInputDialog("Usuário Admin? (true/false):")));

        JOptionPane.showMessageDialog(null, "Farmaceutico criado:\n" +
                "CPF: " + farmaceutico.getCPF() + "\n" +
                "Nome: " + farmaceutico.getNome() + "\n" +
                "Senha: " + farmaceutico.getSenha() + "\n" +
                "Admin? " + farmaceutico.isAdmin());
    }

    private static void exibirFarmaceutico() {
        if (farmaceutico != null) {
            JOptionPane.showMessageDialog(null, "Farmaceutico:\n" +
                    "CPF: " + farmaceutico.getCPF() + "\n" +
                    "Nome: " + farmaceutico.getNome() + "\n" +
                    "Senha: " + farmaceutico.getSenha() + "\n" +
                    "Admin? " + farmaceutico.isAdmin());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Farmaceutico encontrado!");
        }
    }

    private static void atualizarFarmaceutico() {
        if (farmaceutico != null) {
            farmaceutico.setCPF(JOptionPane.showInputDialog("Informe o novo CPF do Farmaceutico:"));
            farmaceutico.setNome(JOptionPane.showInputDialog("Informe o novo Nome do Farmaceutico:"));
            farmaceutico.setSenha(JOptionPane.showInputDialog("Informe a nova Senha do Farmaceutico:"));
            farmaceutico.setAdmin(Boolean.parseBoolean(JOptionPane.showInputDialog("Informe o novo Tipo do Farmaceutico (true/false):")));

            JOptionPane.showMessageDialog(null, "Farmaceutico atualizado:\n" +
                    "CPF: " + farmaceutico.getCPF() + "\n" +
                    "Nome: " + farmaceutico.getNome() + "\n" +
                    "Senha: " + farmaceutico.getSenha() + "\n" +
                    "Tipo: " + farmaceutico.isAdmin());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Farmaceutico encontrado!");
        }
    }

    private static void deletarFarmaceutico() {
        if (farmaceutico != null) {
            farmaceutico = null;
            JOptionPane.showMessageDialog(null, "Farmaceutico deletado!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Farmaceutico encontrado!");
        }
    }

    private static void crudPrescritor() {
        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1. Criar Prescritor\n" +
                            "2. Exibir Prescritor\n" +
                            "3. Atualizar Prescritor\n" +
                            "4. Deletar Prescritor\n" +
                            "0. Voltar"
            ));

            switch (opcao) {
                case 1:
                    criarPrescritor();
                    break;
                case 2:
                    exibirPrescritor();
                    break;
                case 3:
                    atualizarPrescritor();
                    break;
                case 4:
                    deletarPrescritor();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Voltando ao menu principal...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static void criarPrescritor() {
        prescritor = new Prescritor();

        prescritor.setCRM(JOptionPane.showInputDialog("Informe o CRM do Prescritor:"));
        prescritor.setNome(JOptionPane.showInputDialog("Informe o Nome do Prescritor:"));
        prescritor.setMarca(JOptionPane.showInputDialog("Informe a Marca do Prescritor:"));
        prescritor.setHomologacao(Boolean.parseBoolean(JOptionPane.showInputDialog("Informe a Homologação do Prescritor (true/false):")));

        JOptionPane.showMessageDialog(null, "Prescritor criado:\n" +
                "CRM: " + prescritor.getCRM() + "\n" +
                "Nome: " + prescritor.getNome() + "\n" +
                "Marca: " + prescritor.getMarca() + "\n" +
                "Homologação: " + prescritor.isHomologacao());
    }

    private static void exibirPrescritor() {
        if (prescritor != null) {
            JOptionPane.showMessageDialog(null, "Prescritor:\n" +
                    "CRM: " + prescritor.getCRM() + "\n" +
                    "Nome: " + prescritor.getNome() + "\n" +
                    "Marca: " + prescritor.getMarca() + "\n" +
                    "Homologação: " + prescritor.isHomologacao());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Prescritor encontrado!");
        }
    }

    private static void atualizarPrescritor() {
        if (prescritor != null) {
            prescritor.setCRM(JOptionPane.showInputDialog("Informe o novo CRM do Prescritor:"));
            prescritor.setNome(JOptionPane.showInputDialog("Informe o novo Nome do Prescritor:"));
            prescritor.setMarca(JOptionPane.showInputDialog("Informe a nova Marca do Prescritor:"));
            prescritor.setHomologacao(Boolean.parseBoolean(JOptionPane.showInputDialog("Informe a nova Homologação do Prescritor (true/false):")));

            JOptionPane.showMessageDialog(null, "Prescritor atualizado:\n" +
                    "CRM: " + prescritor.getCRM() + "\n" +
                    "Nome: " + prescritor.getNome() + "\n" +
                    "Marca: " + prescritor.getMarca() + "\n" +
                    "Homologação: " + prescritor.isHomologacao());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Prescritor encontrado!");
        }
    }

    private static void deletarPrescritor() {
        if (prescritor != null) {
            prescritor = null;
            JOptionPane.showMessageDialog(null, "Prescritor deletado!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Prescritor encontrado!");
        }
    }

    private static void crudMedicamento() {
        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1. Criar Medicamento\n" +
                            "2. Exibir Medicamento\n" +
                            "3. Atualizar Medicamento\n" +
                            "4. Deletar Medicamento\n" +
                            "0. Voltar"
            ));

            switch (opcao) {
                case 1:
                    criarMedicamento();
                    break;
                case 2:
                    exibirMedicamento();
                    break;
                case 3:
                    atualizarMedicamento();
                    break;
                case 4:
                    deletarMedicamento();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Voltando ao menu principal...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static void criarMedicamento() {
        medicamento = new Medicamento();

        medicamento.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Medicamento:")));
        medicamento.setNome(JOptionPane.showInputDialog("Informe o Nome do Medicamento:"));
        medicamento.setMarca(JOptionPane.showInputDialog("Informe a Marca do Medicamento:"));
        medicamento.setControlado(Boolean.parseBoolean(JOptionPane.showInputDialog("Informe se o Medicamento é controlado (true/false):")));

        JOptionPane.showMessageDialog(null, "Medicamento criado:\n" +
                "ID: " + medicamento.getId() + "\n" +
                "Nome: " + medicamento.getNome() + "\n" +
                "Marca: " + medicamento.getMarca() + "\n" +
                "Controlado: " + medicamento.isControlado());
    }

    private static void exibirMedicamento() {
        if (medicamento != null) {
            JOptionPane.showMessageDialog(null, "Medicamento:\n" +
                    "ID: " + medicamento.getId() + "\n" +
                    "Nome: " + medicamento.getNome() + "\n" +
                    "Marca: " + medicamento.getMarca() + "\n" +
                    "Controlado: " + medicamento.isControlado());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Medicamento encontrado!");
        }
    }

    private static void atualizarMedicamento() {
        if (medicamento != null) {
            medicamento.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o novo ID do Medicamento:")));
            medicamento.setNome(JOptionPane.showInputDialog("Informe o novo Nome do Medicamento:"));
            medicamento.setMarca(JOptionPane.showInputDialog("Informe a nova Marca do Medicamento:"));
            medicamento.setControlado(Boolean.parseBoolean(JOptionPane.showInputDialog("Informe se o Medicamento é controlado (true/false):")));

            JOptionPane.showMessageDialog(null, "Medicamento atualizado:\n" +
                    "ID: " + medicamento.getId() + "\n" +
                    "Nome: " + medicamento.getNome() + "\n" +
                    "Marca: " + medicamento.getMarca() + "\n" +
                    "Controlado: " + medicamento.isControlado());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Medicamento encontrado!");
        }
    }

    private static void deletarMedicamento() {
        if (medicamento != null) {
            medicamento = null;
            JOptionPane.showMessageDialog(null, "Medicamento deletado!");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Medicamento encontrado!");
        }
    }
}
