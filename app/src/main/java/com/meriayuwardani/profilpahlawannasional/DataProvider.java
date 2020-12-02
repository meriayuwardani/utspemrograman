package com.meriayuwardani.profilpahlawannasional;

import android.content.Context;

import com.meriayuwardani.profilpahlawannasional.model.Pahlawan;
import com.meriayuwardani.profilpahlawannasional.model.Pahlawan_ampera;
import com.meriayuwardani.profilpahlawannasional.model.Pahlawan_nasional;
import com.meriayuwardani.profilpahlawannasional.model.Pahlawan_revolusi;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Pahlawan> Pahlawans = new ArrayList<>();

    private static List<Pahlawan_ampera> initDataPahlawan_ampera(Context ctx) {
        List<Pahlawan_ampera> pahlawan_amperas = new ArrayList<>();
        pahlawan_amperas.add(new Pahlawan_ampera("Arif Rahman Hakim", "Padang",
                "lahir di Padang, Sumatra Barat, 24 Februari 1943", R.drawable.pahlawan_ampera_arisrahmanhakim));
        pahlawan_amperas.add(new Pahlawan_ampera("Hasanuddin Haji Madjedi", "Banjarmasin",
                "lahir di Banjarmasin, Kalimantan Selatan Desember 1945", R.drawable.pahlawan_ampera_hasanuddinhajimadjedi));
        pahlawan_amperas.add(new Pahlawan_ampera("Elang Mulya", "Jakarta",
                "lahir di Jakarta, 5 Juli 1978", R.drawable.pahlawan_ampera_elangmulya));
        pahlawan_amperas.add(new Pahlawan_ampera("Ikhwan Ridwan Rais", "Teluk Betung",
                "lahir di Teluk Petung,5 Agustus 1951", R.drawable.pahlawan_ampera_ikhwanridwanrais));
        pahlawan_amperas.add(new Pahlawan_ampera("Ahmad Karim", "Bukit Tinggi",
                "lahir pada tahun 1947 di kampung landu, jorong parit lubang, nagari ladang panjang, kecamatan tigo nagari, Kabupaten pasaman.", R.drawable.pahlawan_ampera_ahmadhakim));
        return pahlawan_amperas;
    }

    private static List<Pahlawan_nasional> initDataPahlawan_nasional(Context ctx) {
        List<Pahlawan_nasional> pahlawan_nasionals = new ArrayList<>();
        pahlawan_nasionals.add(new Pahlawan_nasional("Ir.soekarno", "Blitar",
                "dilahirkan di Surabaya tepatnya pada tanggal 6 Juni 1901", R.drawable.pahlawan_nasional_irsoekarno));
        pahlawan_nasionals.add(new Pahlawan_nasional("Mohammad Hatta", "Bukit tinggi",
                " lahir dengan nama Mohammad Athar di Fort de Kock, Hindia Belanda, 12 Agustus 1902 ", R.drawable.pahlawan_nasional_mohammadhatta));
        pahlawan_nasionals.add(new Pahlawan_nasional("Sutomo", "Jawa Timur",
                "lahir di Ngepeh, Loceret, Nganjuk, Jawa Timur, 30 Juli 1888", R.drawable.pahlawan_nasional_sutomo));
        pahlawan_nasionals.add(new Pahlawan_nasional("Pangeran Diponorogo", "Ngayogyakarta Hadiningrat",
                "lahir di Ngayogyakarta Hadiningrat, 11 November 1785 ", R.drawable.pahlawan_nasional_pangerandipeonerogo));
        pahlawan_nasionals.add(new Pahlawan_nasional("Hasyim Asy'ari", "Jawa Timur",
                "lahir pada tanggal 10 april 1875, di desa gedang, kecamatan diwk, kabupaten jombang, jawa timur", R.drawable.pahlawan_nasional_hasyimasyaari));
        return pahlawan_nasionals;
    }


    private static List<Pahlawan_revolusi> initDataPahlawan_revolusi(Context ctx) {
        List<Pahlawan_revolusi> pahlawan_revolusis = new ArrayList<>();
        pahlawan_revolusis.add(new Pahlawan_revolusi("Jendral Ahmad Yani", "Jawa Tengah",
                "lahir di Purworejo, Jawa Tengah, 19 Juni 1922", R.drawable.pahlawan_revolusi_jendralahmadyani));
        pahlawan_revolusis.add(new Pahlawan_revolusi("Mayjen R soeprapto", "Jawa Tengah",
                "lahir di Purwokerto, Jawa Tengah, 20 Juni 1920", R.drawable.pahlawan_revolusi_mayjenrsurapto));
        pahlawan_revolusis.add(new Pahlawan_revolusi("Mayjen MT Haryono", "Jawa Timur",
                "lahir si Surabaya, Jawa Timur, 20 Januari", R.drawable.pahlawan_revolusi_mayjenmtharyono));
        pahlawan_revolusis.add(new Pahlawan_revolusi("Mayjen S Parman", "Jawa Tengah",
                "lahir di Wonosobo, Jawa Tengah, 4 Agustus 1918", R.drawable.pahlawan_revolusi_mayjensparman));
        pahlawan_revolusis.add(new Pahlawan_revolusi("Brigjen D.I Panjaitan", "Sumatra Utara",
                "lahir di Balige, Sumatra Utara, 9 juni 1925", R.drawable.pahlawan_revolusi_brigjendipanjaitan));
        return pahlawan_revolusis;
    }

    private static void initAllPahlawans(Context ctx) {
        Pahlawans.addAll(initDataPahlawan_ampera(ctx));
        Pahlawans.addAll(initDataPahlawan_nasional(ctx));
        Pahlawans.addAll(initDataPahlawan_revolusi(ctx));
    }

    public static List<Pahlawan> getAllPahlawan(Context ctx) {
        if (Pahlawans.size() == 0) {
            initAllPahlawans(ctx);
        }
        return  Pahlawans;
    }

    public static List<Pahlawan> getPahlawansByTipe(Context ctx, String nama) {
        List<Pahlawan> PahlawansByType = new ArrayList<>();
        if (Pahlawans.size() == 0) {
            initAllPahlawans(ctx);
        }
        for (Pahlawan h : Pahlawans) {
            if (h.getprofil().equals(nama)) {
                PahlawansByType.add(h);
            }
        }
        return PahlawansByType;
    }

}
