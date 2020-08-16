import java.util.Scanner;

public class desafioLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //login cliente - Dados//

        System.out.println("Digite o primeiro nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite teu sobrenome: ");
        String sobrenome = scanner.nextLine();

        String login = nome.charAt(0) + "_" + sobrenome;
        String senha = null;

        //Cadastro senha//

        boolean validaSenhaP = false;

        while (validaSenhaP == false) {


            System.out.println("Digite uma senha de 8 dígitos incluíndo uma letra minúscula, uma maiúscula, um número e um caracter especial: ");
            senha = scanner.nextLine();

                   if (senha.length() >= 8 && senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")) {

                    System.out.println("Senha Válida! ");

                    validaSenhaP = true;


                } else {
                    System.out.println("Senha inválida, tente novamente! Lembre-se tua senha deve conter pelo menos 8 dígitos, uma letra minúscula, uma maiúscula, um número e um caracter especial: ");
                    }

                }

                if (validaSenhaP == true) {
                    System.out.println("Cadastro realizado com sucesso!");
                    System.out.println("Teu nome de usuário será: " + login);
                }


                //Validação de login//

                System.out.println("Efetue login: ");

                boolean validar = false;
                while (validar == false) {

                    System.out.println("Digite teu nome de usuário: ");
                    String loginv = scanner.nextLine();

                    System.out.println("Digite tua senha: ");
                    String senhav = scanner.nextLine();

                    if (senhav.equals(senha) && loginv.equals(login)) {
                        System.out.println("Seja bem-vindo, " + login);
                        validar = true;

                    } else {
                        System.out.println("Senha ou nome de usuário inválido. Tente novamente.");
                    }
                }
            }
        }


