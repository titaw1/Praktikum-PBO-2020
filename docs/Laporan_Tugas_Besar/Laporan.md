# LAPORAN TUGAS BESAR (PROGRAM APOTEK)
## A. Class Diagram 
<img src = "Class Diagram.jpg">

## B. Penjelasan Program 
Pada umumnya, sebuah apotek memiliki dua macam karyawan yaitu kasir dan apoteker. Selain itu, terdapat dua macam pembeli yaitu member dan non member. Dan yang paling utama, tentunya setiap apotek memiliki data persediaan obat yang mereka jual. Sehingga,pada program apotek ini terdapat 9 class diantaranya yaitu class interface IKaryawan yang berelasi dengan class Apoteker dan Kasir. Kemudian ada class Pembeli, PembeliMember dan PembeliNonMember, yang mana ketiga kelas tersebut berelasi secara inheritance dengan class Pembeli sebagai superclassnya. Lalu terdapat juga class Obat yang berelasi dengan abstract class ResepObat. Dan yang terakhir adalah class Transaksi yang berelasi dengan class Kasir, Pembeli dan Obat. Pada program ini, kita bisa menambah, mengubah, dan menghapus data serta mencari data sesuai keyword yang kita inginkan.