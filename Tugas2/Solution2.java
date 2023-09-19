import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        LinkedList<Integer> listKereta = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String keteranganInput = input.next();

            if (keteranganInput.equals("TambahTengah")) {
                int lokasiGerbongInt = input.nextInt();
                int nomorGerbong = input.nextInt();

                if (listKereta.contains(nomorGerbong)) {
                    System.out.println("Gagal menambahkan gerbong");
                } else if (listKereta.contains(lokasiGerbongInt)) {
                    int index = listKereta.indexOf(lokasiGerbongInt);
                    listKereta.add(index + 1, nomorGerbong);
                    System.out.println("Berhasil menambahkan gerbong");
                } else {
                    System.out.println("Gagal menambahkan gerbong");
                }
            } else if (keteranganInput.equals("TambahDepan")) {
                int nomorGerbong = input.nextInt();
                if (!listKereta.contains(nomorGerbong)) {
                    listKereta.addFirst(nomorGerbong);
                    System.out.println("Berhasil menambahkan gerbong");
                } else {
                    System.out.println("Gagal menambahkan gerbong");
                }
            } else if (keteranganInput.equals("TambahBelakang")) {
                int nomorGerbong = input.nextInt();
                if (!listKereta.contains(nomorGerbong)) {
                    listKereta.addLast(nomorGerbong);
                    System.out.println("Berhasil menambahkan gerbong");
                } else {
                    System.out.println("Gagal menambahkan gerbong");
                }
            } else if (keteranganInput.equals("LihatKereta")) {
                
                    for (Integer gerbong : listKereta) {
                        System.out.print(gerbong + " ");
                    }
                    System.out.println();
                
            } else if (keteranganInput.equals("HapusDepan")) {
                if (!listKereta.isEmpty()) {
                    listKereta.removeFirst();
                    System.out.println("Berhasil menghapus gerbong");
                } 
            } else if (keteranganInput.equals("HapusBelakang")) {
                if (!listKereta.isEmpty()) {
                    listKereta.removeLast();
                    System.out.println("Berhasil menghapus gerbong");
                }
            } else if (keteranganInput.equals("HapusGerbong")) {
                int nomorGerbong = input.nextInt();
                if (listKereta.contains(nomorGerbong)) {
                    listKereta.remove(Integer.valueOf(nomorGerbong));
                    System.out.println("Berhasil menghapus gerbong");
                } else {
                    System.out.println("Gagal menghapus gerbong");
                }
            } else if (keteranganInput.equals("UrutkanGerbong")) {
                urutGerbong(listKereta);
            }
        }
        
        input.close();
    }

    public static void urutGerbong(LinkedList<Integer> list) {
        Collections.sort(list);
        System.out.println("Gerbong telah diurutkan");
    }
}
