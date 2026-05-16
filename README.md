# RecyclerView1

Simple Android project showing a basic `RecyclerView` implementation with a **grid layout**.

## Paket
- `id.sch.smktelkom_mlg.learn.recyclerview2`

## Deskripsi
Project ini menampilkan daftar hotel dalam bentuk kartu gambar menggunakan `RecyclerView` dengan `GridLayoutManager` (2 kolom).

Data diambil dari resource:
- `res/values/strings.xml`
  - `places` (judul)
  - `place_desc` (deskripsi)
  - `places_picture` (gambar)

Komponen utama:
- `MainActivity` sebagai entry point, menyiapkan `RecyclerView` dan data.
- `HotelAdapter` sebagai adapter untuk bind data.
- `Hotel` sebagai model data item.

## Struktur penting
- `app/src/main/java/id/sch/smktelkom_mlg/learn/recyclerview2/MainActivity.java`
- `app/src/main/java/adapter/HotelAdapter.java`
- `app/src/main/java/model/Hotel.java`
- `app/src/main/res/layout/item_list.xml`
- `app/src/main/res/layout/activity_main.xml`

## Cara jalan
1. Clone repo
2. Buka di Android Studio
3. Sync Gradle
4. Jalankan di emulator/device

## Catatan
Project ini menggunakan konfigurasi lama Android (API 24 era support libs), cocok sebagai studi kasus UI dasar RecyclerView.
