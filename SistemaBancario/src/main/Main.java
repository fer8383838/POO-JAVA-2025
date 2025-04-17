package main;

import dao.CuentaDao;


public class Main {
    public static void main(String[] args) {
        try {
            CuentaDao cuentaDao = new CuentaDao();
            System.out.println("=== SALDOS INICIALES ===");
            System.out.println("Cuenta A (id=1): $" + cuentaDao.obtenerSaldo(1));
            System.out.println("Cuenta B (id=2): $" + cuentaDao.obtenerSaldo(2));

            double monto = 200.00;
            System.out.println("\nTransfiriendo $" + monto + " de Cuenta A a Cuenta B...");
            cuentaDao.transferir(1, 2, monto);

            System.out.println("\n=== SALDOS DESPUÉS DE LA TRANSFERENCIA ===");
            System.out.println("Cuenta A (id=1): $" + cuentaDao.obtenerSaldo(1));
            System.out.println("Cuenta B (id=2): $" + cuentaDao.obtenerSaldo(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
