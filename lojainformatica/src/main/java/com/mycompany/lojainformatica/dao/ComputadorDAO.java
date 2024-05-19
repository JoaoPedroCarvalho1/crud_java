package com.mycompany.lojainformatica.dao;

import com.mycompany.lojainformatica.models.Computador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ComputadorDAO {

    static String URL = "jdbc:mysql://localhost:3306/lojainformatica";
    static String login = "root";
    static String senha = "135246";

    public static boolean salvar(Computador obj) {
        Connection conexao = null;
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);

            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "INSERT INTO computador(marca,hd,processador) VALUES(?,?,?);");
            instrucaoSQL.setString(1, obj.getMarca());
            instrucaoSQL.setString(2, obj.getHd());
            instrucaoSQL.setString(3, obj.getProcessador());

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName());
                }
            }
        }
        return retorno;
    }

    public static ArrayList<Computador> listar(){
        ArrayList<Computador> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);
            ResultSet rs = null;

            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "SELECT * FROM computador");

            rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String hd = rs.getString("HD");
                    String processador = rs.getString("Processador");
               
                    Computador item = new Computador(id, hd, processador);
                    listaRetorno.add(item);
                }
                
            }
        } catch (Exception e) {
            listaRetorno = null;
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                }catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName());
                }
            }
        }
        return listaRetorno;
    }

    public static boolean Alterar(Computador obj) {
        Connection conexao = null;
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);

            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "UPDATE computador set hd=?, processador = ? WHERE id = ?");
            instrucaoSQL.setString(1, obj.getHd());
            instrucaoSQL.setString(2, obj.getProcessador());
            instrucaoSQL.setInt(3, obj.getId());

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName());
                }
            }
        }
        return retorno;
    }

    public static boolean Excluir(int idExcluir) {
        Connection conexao = null;
        boolean retorno = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, login, senha);

            PreparedStatement instrucaoSQL = conexao.prepareStatement(
                    "DELETE FROM computador WHERE id = ?");
            instrucaoSQL.setInt(1, idExcluir);

            int linhasAfetadas = instrucaoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName());
                }
            }
        }
        return retorno;
    }
}