package banco.univel.rmi.remotebase;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteBancoUnivel extends Remote {
	public void cadastrarUsuario(int id, String nome) throws RemoteException;
	public void deposito(int idUsuario, double valor) throws RemoteException;
	public void saque(int idUsuario, double valor) throws RemoteException;
	public double saldo(int idUsuario) throws RemoteException; 

}
