package tabungan;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class Tabungan {
    private int saldo;

    public Tabungan (int saldo){
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah){
        return this.saldo - jumlah;
    }
}
