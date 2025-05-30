package view;

import controller.Agenda;
import model.Contato;
import model.ContatoPessoal;
import model.ContatoProfissional;
import model.Endereco;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Contato Pessoal");
            System.out.println("2. Adicionar Contato Profissional");
            System.out.println("3. Buscar por Nome");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Remover Contato");
            System.out.println("6. Editar Contato");
            System.out.println("7. Sair");
            System.out.print("Escolha: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            if (op == 7) break;

            switch (op) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String tel = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Data de aniversário: ");
                    String aniversario = scanner.nextLine();

                    Endereco endereco = new Endereco(rua, cidade, estado, cep);
                    ContatoPessoal cp = new ContatoPessoal(nome, tel, email, endereco, aniversario);
                    agenda.adicionarContato(cp);
                    System.out.println("Contato pessoal adicionado!");
                }

                case 2 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String tel = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.print("Empresa: ");
                    String empresa = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    Endereco endereco = new Endereco(rua, cidade, estado, cep);
                    ContatoProfissional cp = new ContatoProfissional(nome, tel, email, endereco, empresa, cargo);
                    agenda.adicionarContato(cp);
                    System.out.println("Contato profissional adicionado!");
                }

                case 3 -> {
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    Contato c = agenda.buscarPorNome(nome);
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                }

                case 4 -> {
                    System.out.println("\n--- CONTATOS ---");
                    for (Contato c : agenda.listarTodos()) {
                        System.out.println(c + "\n----------------");
                    }
                }

                case 5 -> {
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nome = scanner.nextLine();
                    if (agenda.removerContato(nome)) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                }

                case 6 -> {
                    System.out.print("Digite o nome do contato a ser editado: ");
                    String nome = scanner.nextLine();
                    Contato antigo = agenda.buscarPorNome(nome);
                    if (antigo != null) {
                        System.out.print("Novo Nome: ");
                        String novoNome = scanner.nextLine();
                        System.out.print("Novo Telefone: ");
                        String novoTel = scanner.nextLine();
                        System.out.print("Novo Email: ");
                        String novoEmail = scanner.nextLine();
                        System.out.print("Nova Rua: ");
                        String novaRua = scanner.nextLine();
                        System.out.print("Nova Cidade: ");
                        String novaCidade = scanner.nextLine();
                        System.out.print("Novo Estado: ");
                        String novoEstado = scanner.nextLine();
                        System.out.print("Novo CEP: ");
                        String novoCep = scanner.nextLine();

                        Endereco novoEndereco = new Endereco(novaRua, novaCidade, novoEstado, novoCep);
                        Contato novoContato;

                        if (antigo instanceof ContatoPessoal) {
                            System.out.print("Nova Data de Aniversário: ");
                            String novaDataAniversario = scanner.nextLine();
                            novoContato = new ContatoPessoal(novoNome, novoTel, novoEmail, novoEndereco, novaDataAniversario);
                        } else {
                            System.out.print("Nova Empresa: ");
                            String novaEmpresa = scanner.nextLine();
                            System.out.print("Novo Cargo: ");
                            String novoCargo = scanner.nextLine();
                            novoContato = new ContatoProfissional(novoNome, novoTel, novoEmail, novoEndereco, novaEmpresa, novoCargo);
                        }

                        agenda.editarContato(antigo, novoContato);
                        System.out.println("Contato editado com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                }

                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Encerrando programa...");
    }
}
