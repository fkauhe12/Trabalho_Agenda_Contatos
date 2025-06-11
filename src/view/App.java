package view;

// Importação de classes
import controller.Agenda;
import model.Contato;
import model.ContatoPessoal;
import model.ContatoProfissional;
import model.Endereco;

// Importação de bibliotecas
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            try {
                // Exibe o menu
                System.out.println("\n--- MENU ---");
                System.out.println("1. Adicionar Contato Pessoal");
                System.out.println("2. Adicionar Contato Profissional");
                System.out.println("3. Buscar por Nome");
                System.out.println("4. Listar Contatos");
                System.out.println("5. Remover Contato");
                System.out.println("6. Editar Contato");
                System.out.println("7. Sair");
                System.out.print("Escolha: ");

                // le a opção do usuário
                int op = scanner.nextInt();
                scanner.nextLine();

                if (op == 7) break;

                // Verifica se a opção é válida
                switch (op) {
                    case 1 -> {
                        try {
                            // Coleta de dados do contato pessoal
                            System.out.println("\n--- ADICIONAR CONTATO PESSOAL ---");
                            System.out.print("Nome: ");
                            String nome = scanner.nextLine().trim();
                            if (nome.isEmpty()) throw new IllegalArgumentException("Nome nao pode estar vazio.");

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
                            System.out.print("Data de aniversario: ");
                            String aniversario = scanner.nextLine();

                            // Objeto Endereco e ContatoPessoal
                            Endereco endereco = new Endereco(rua, cidade, estado, cep);
                            ContatoPessoal cp = new ContatoPessoal(nome, tel, email, endereco, aniversario);
                            agenda.adicionarContato(cp);
                            System.out.println("Contato pessoal adicionado!");
                        } catch (Exception e) {
                            System.out.println("Erro ao adicionar contato pessoal: " + e.getMessage());
                        }
                    }

                    case 2 -> {
                        try {
                            // Coleta de dados do contato profissional
                            System.out.println("\n--- ADICIONAR CONTATO PROFISSIONAL ---");
                            System.out.print("Nome: ");
                            String nome = scanner.nextLine().trim();
                            if (nome.isEmpty()) throw new IllegalArgumentException("Nome nao pode estar vazio.");

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

                            // Objeto Endereco e ContatoProfissional
                            Endereco endereco = new Endereco(rua, cidade, estado, cep);
                            ContatoProfissional cp = new ContatoProfissional(nome, tel, email, endereco, empresa, cargo);
                            agenda.adicionarContato(cp);
                            System.out.println("Contato profissional adicionado!");
                        } catch (Exception e) {
                            System.out.println("Erro ao adicionar contato profissional: " + e.getMessage());
                        }
                    }

                    case 3 -> {
                        // Busca por nome
                        System.out.println("\n--- BUSCAR CONTATO POR NOME ---");
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine().trim();
                        Contato c = agenda.buscarPorNome(nome);
                        if (c != null) {
                            System.out.println(c);
                        } else {
                            System.out.println("Contato não encontrado.");
                        }
                    }

                    case 4 -> {
                        // Listar todos os contatos
                        System.out.println("\n--- LISTAR TODOS OS CONTATOS ---");
                        System.out.println("\n--- CONTATOS ---");
                        for (Contato c : agenda.listarTodos()) {
                            System.out.println(c + "\n----------------");
                        }
                    }

                    case 5 -> {
                        // Remover contato
                        System.out.println("\n--- REMOVER CONTATO ---");
                        System.out.print("Digite o nome do contato a ser removido: ");
                        String nome = scanner.nextLine().trim();
                        if (agenda.removerContato(nome)) {
                            System.out.println("Contato removido com sucesso!");
                        } else {
                            System.out.println("Contato nao encontrado.");
                        }
                    }

                    case 6 -> {
                        // Editar contato
                        System.out.println("\n--- EDITAR CONTATO ---");
                        System.out.print("Digite o nome do contato a ser editado: ");
                        String nome = scanner.nextLine().trim();
                        Contato c = agenda.buscarPorNome(nome);
                        
                        if (c != null) {
                            boolean editando = true;
                            while (editando) {
                                try {
                                    // Exibe opções de edição
                                    System.out.println("\n--- EDITAR CONTATO ---");
                                    System.out.println("1. Nome");
                                    System.out.println("2. Telefone principal");
                                    System.out.println("3. Email principal");
                                    System.out.println("4. Endereço");
                                    System.out.println("5. Voltar");
                                    System.out.print("Escolha o campo para editar: ");

                                    int campo = scanner.nextInt();
                                    scanner.nextLine();

                                    
                                    switch (campo) {
                                        case 1 -> {
                                            // Editar nome
                                            System.out.print("Novo nome: ");
                                            String novoNome = scanner.nextLine().trim();
                                            if (novoNome.isEmpty()) throw new IllegalArgumentException("Nome nao pode estar vazio.");
                                            c.setNome(novoNome);
                                            System.out.println("Nome atualizado!");
                                        }
                                        case 2 -> {
                                            // Editar telefone
                                            System.out.print("Novo telefone: ");
                                            String novoTel = scanner.nextLine();
                                            if (!c.getTelefones().isEmpty()) {
                                                c.getTelefones().set(0, novoTel);
                                            } else {
                                                c.adicionarTelefone(novoTel);
                                            }
                                            System.out.println("Telefone atualizado!");
                                        }
                                        case 3 -> {
                                            // Editar email
                                            System.out.print("Novo email: ");
                                            String novoEmail = scanner.nextLine();
                                            if (!c.getEmails().isEmpty()) {
                                                c.getEmails().set(0, novoEmail);
                                            } else {
                                                c.adicionarEmail(novoEmail);
                                            }
                                            System.out.println("Email atualizado!");
                                        }
                                        case 4 -> {
                                            // Editar endereço
                                            System.out.print("Rua: ");
                                            String rua = scanner.nextLine();
                                            System.out.print("Cidade: ");
                                            String cidade = scanner.nextLine();
                                            System.out.print("Estado: ");
                                            String estado = scanner.nextLine();
                                            System.out.print("CEP: ");
                                            String cep = scanner.nextLine();
                                            Endereco novoEnd = new Endereco(rua, cidade, estado, cep);
                                            c.setEndereco(novoEnd);
                                            System.out.println("Endereco atualizado!");
                                        }
                                        case 5 -> editando = false;

                                        default -> System.out.println("Opção invalida.");
                                    }
                                
                                } catch (InputMismatchException e) {
                                    System.out.println("Entrada invalida. Digite um número.");
                                    scanner.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Erro: " + e.getMessage());
                                }
                            }
                        } else {
                            System.out.println("Contato não encontrado.");
                        }
                    }

                    default -> System.out.println("Opção inválida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro de entrada: digite apenas numeros inteiros.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Encerrando programa. Obrigado por usar a agenda!");
    }
}
