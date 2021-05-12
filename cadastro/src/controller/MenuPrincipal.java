package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.VeiculoLeve;
import model.VeiculoPesado;
import model.Motocicleta;
import model.Motorista;
import model.Multa;
import model.Veiculo;

public class MenuPrincipal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem vindo de volta! Como posso te ajudar ? \n \n Selecione a opção desejada:");
        
        int control = 0;
        
        ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
        ArrayList<Motorista> listaMotorista = new ArrayList<Motorista>();
        ArrayList<Multa> listaMulta = new ArrayList<Multa>();
        
        String relacionamento[][] = new String[10][10];
        
        do {
            System.out.println("\n");
            System.out.println("(1) Cadastrar ou visualizar os veículos");
            System.out.println("(2) Cadastrar ou visualizar os motoristas");
            System.out.println("(3) Cadastrar ou visualizar as multas");
            System.out.println("(4) Visualizar multas, motoristas e veículos");
            System.out.println("(0) Sair.");

            control = leitor.nextInt();

            if(control == 1) {
                int aux = 1;
                do {
                    System.out.println("\n");
                    System.out.println("(2) Cadastrar um veículo leve");
                    System.out.println("(3) Cadastrar um veículo pesado");
                    System.out.println("(4) Cadastrar uma motocicleta");
                    System.out.println("(5) Visualizar os veículos cadastrados");
                    System.out.println("(0) Menu Principal");
                    
                    control = leitor.nextInt();
                    
                    if(control == 2) {
                        System.out.println("\n");
                        System.out.println("Qual é a placa do veículo ?  ");
                        
                        String placa = leitor.next();

                        System.out.println("e a cor do veículo: ");
                        String cor = leitor.next();

                        System.out.println("Agora, por favor me diz a marca? ");
                        String marca = leitor.next();

                        System.out.println("Qual é o modelo? ");
                        String modelo = leitor.next();
                
                        System.out.println("Qual a potência do véiculo? ");
                        int pot = leitor.nextInt();
  
                        VeiculoLeve veiculoleve = new VeiculoLeve(placa,cor,marca,modelo,pot);
                        listaVeiculos.add(veiculoleve);
                        
                        relacionamento[0][aux] = veiculoleve.getPlaca();
                        aux++;
                    }
                    else if(control == 3) {
                        System.out.println("\n");
                        System.out.println("Qual é a placa do veículo pesado? ");
                        String placa = leitor.next();

                        System.out.println("Por favor, me diz a cor? ");
                        String cor = leitor.next();

                        System.out.println("Qual é a marca, por favor? ");
                        String marca = leitor.next();

                        System.out.println("Agora o modedelo? ");
                        String modelo = leitor.next();
                
                        System.out.println("Qual a capacidade de carga? ");
                        int capCarga = leitor.nextInt();
                        
                        VeiculoPesado veiculopesado = new VeiculoPesado (placa,cor,marca,modelo,capCarga);
                        listaVeiculos.add(veiculopesado);
                        
                        relacionamento[0][aux] = veiculopesado.getPlaca();
                        aux++;
                    }
                    else if(control == 4) {
                        System.out.println("\n");
                        System.out.println("Qual é a placa da moto? ");
                        String placa = leitor.next();

                        System.out.println("Por favor a cor da moto: ");
                        String cor = leitor.next();

                        System.out.println("Agora por favor a marca da moto: ");
                        String marca = leitor.next();

                        System.out.println("Por gentileza qual é o modelo da moto? ");
                        String modelo = leitor.next();
                
                        System.out.println("Qual é a cilindradas: ");
                        int cc = leitor.nextInt();
                        
                        Motocicleta motocicleta = new Motocicleta (placa,cor,marca,modelo,cc);
                        listaVeiculos.add(motocicleta);
                        
                        relacionamento[0][aux] = motocicleta.getPlaca();
                        aux++;
                    }
                    else if(control == 5) {
                        System.out.println("\n");
                        for(Veiculo i : listaVeiculos) {
                            System.out.println(i+"\n-------");
                        }
                    }
                    else if(control == 0) {
                        control = -77;
                    }
                    else {
                        System.out.println("\n");
                        System.out.println("A opção desejada inválida :( ");
                        System.out.println("\n");
                    }
                }while(control != -77);  
            }
            else if(control == 2) {
                int aux = 1;
                do {
                    System.out.println("\n");
                    System.out.println("(3) Cadastrar um motorista");
                    System.out.println("(4) Visualizar motoristas cadastrados");
                    System.out.println("(0) Menu principal");
                    
                    control = leitor.nextInt();
                    
                    if(control == 3) {
                        System.out.println("\n");
                        System.out.println("Qual é o nome do Motorista? ");
                        String nome = leitor.next();
                    
                        System.out.println("Qual a categoria da CNH? ");
                        String tpCnh = leitor.next();
                    
                        System.out.println("Por favor o número da CNH: ");
                        String numeroCnh = leitor.next();
                        
                        Motorista motorista = new Motorista(nome,tpCnh,numeroCnh);
                        listaMotorista.add(motorista);
                        
                        relacionamento[aux][0] = motorista.getNome();
                        aux++;
                    }
                    else if(control == 4) {
                        System.out.println("\n");
                        for (Motorista i : listaMotorista){
                            System.out.println(i+"\n----------");
                        }
                    }
                    else if(control == 0) {
                        control = -77;
                    }
                    else {
                        System.out.println("\n");
                        System.out.println("A opção desejada inválida :( ");
                        System.out.println("\n");
                    }
                }while(control != -77);
            }
            else if(control == 3) {
                do {
                    System.out.println("\n");
                    System.out.println("(4) Cadastrar uma multa");
                    System.out.println("(5) Visualizar multas ");
                    System.out.println("(0) Menu Principal.");
                    
                    control = leitor.nextInt();
                    
                    if(control == 4) {
                        System.out.println("\n");
                        System.out.println("Qual a categoria da multa? (Leve, média, grave, gravissíma) ");
                        String codigoMulta = leitor.next();
                    
                        System.out.println("Valor da multa: ");
                        double valorMulta = leitor.nextDouble();
                        
                        System.out.println("Motorista autuado: ");
                        String nomeMotorista = leitor.next();
                        
                        System.out.println("Placa do veiculo da autuação: ");
                        String placaVeiculo = leitor.next();
                            
                        Multa multa = new Multa(codigoMulta,valorMulta);
                        listaMulta.add(multa);
                        
                        for(int i = 0; i < relacionamento.length; i++) {
                            if(nomeMotorista.equals(relacionamento[i][0])) {
                                for(int j = 0; j <relacionamento[0].length; j++) {
                                    if(placaVeiculo.equals(relacionamento[0][j])) { 
                                        relacionamento[i][j] = multa.getCodigoMulta()+" ";
                                    }
                                }
                            }    
                        }
                    }
                    else if(control == 5) {
                        System.out.println("\n");
                        for(Multa i : listaMulta) {
                            System.out.println(i+"\n------------");
                        }
                    }
                    else if(control == 0) {
                        control = -77;
                    }
                    else {
                        System.out.println("\n");
                        System.out.println("A opção desejada inválida :( ");
                        System.out.println("\n");
                    }
                }while(control != -77);
            }
            else if(control == 4) {
                for(int i = 0; i < relacionamento.length;i++) {
                    for(int j = 0; j < relacionamento[0].length; j++) {
                        if(relacionamento[i][j] == null) {
                            relacionamento[i][j] = "  |  ";
                        }   
                    }
                }
                System.out.println("\n");
                for(int i = 0; i < relacionamento.length;i++) {
                    for(int j = 0; j < relacionamento[0].length; j++) {
                        System.out.print(relacionamento[i][j]+" ");
                    }
                    System.out.println(" ");
                }        
            }
            else if(control == 0) {
                System.out.println("\n");
                System.out.println("Obrigado por utilizar nosso sistema ;) ");
                break;
            }  
            else {
                System.out.println("\n");
                System.out.println("A opção desejada inválida :( ");
                System.out.println("\n");
            }  
        }while (control != -7);   
    }
}
