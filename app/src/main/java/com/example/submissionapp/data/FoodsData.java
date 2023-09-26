package com.example.submissionapp.data;

import com.example.submissionapp.R;
import com.example.submissionapp.model.Foods;

import java.util.ArrayList;
import java.util.Locale;

public class FoodsData {
    private static String [] foodTitle = {
            "Coto Makassar",
            "Pisang Epe",
            "Gogos Bakar",
            "Konro Bakar",
            "Kapurung khas palopo",
            "Ketupat dan Burasa",
            "Putu Cangkir",
            "Jalangkote",
            "Es Pisang Ijo",
            "Kue Barongko",
    };

    private static String [] foodDetail = {
            "Komposisi isian coto makassar terdiri dari daging dengan kuah berempah khas, serta disajikan dengan buras. Makanan khas Makassar satu ini menjadi ikon kuliner yang patut dicicipi oleh wisatawan.\n",
            "Pisang epe juga dibuat dari pisang yaitu jenis pisang kepok yang masih setengah matang. Pisang kepok dikupas kemudian dibakar di atas bara api, dibolak-balik sampai harum serta lembek. Kemudian pisang dipipihkan dan dibakar kembali. Setelah matang pisang disajikan dengan siraman saus gula merah dan durian yang kental.\n",
            "Gogoso termasuk makanan khas bugis Makassar yang menjadi menu saat lebaran. Gogoso terbuat dari beras ketan yang dibakar di dalam bungkusan daun pisang. Sering disajikan dengan telur asin oleh warga Makassar.\n",
            "Bahan baku makanan tradisional Makassar yang bernama konro terdiri dari iga atau daging sapi yang direbus dengan bumbu dan rempah. Bumbu dan rempahnya ada kayu manis, air asam, merica, pala, kacang merah, dan kluwek yang memberikan warna gelap pada kuahnya.\n",
            "Kapurung adalah makanan tradisional di daerah Luwu, Sulawesi Selatan yang lebih dikenal dengan sebutan pugalu. Makanan khas Makassar ini terbuat dari sagu yang dimasak seperti bakso. Disajikan dengan kuah berbumbu kacang serta campuran ikan atau ayam serta aneka sayuran.\n",
            "Buras atau burasa’ punya bentuk mirip seperti lontong yang dibuat dari beras tetapi dengan bentuk yang berbeda.\n",
            "Makanan khas Makassar ini merupakan olahan dari ketan dengan rasa manis yang dibentuk mirip cangkir.\n",
            "Jalangkote bentuknya mirip seperti kue pastel. Perbedaannya, makanan khas Makassar ini isiannya berisi potongan wortel dan kentang berbentuk dadu, lengkap dengan taoge, serta soun.\n",
            "Es pisang ijo adalah kudapan khas dari Makassar, Sulawesi Selatan. Hidangan ini diolah dari buah pisang raja, ambon, atau kepok yang sudah matang. Pisang dibalut dengan adonan tepung beras bercampur santan dan air daun pandan yang memberi warna hijau dan aroma pandan.\n",
            "Barongko adalah makanan penutup yang memiliki cita rasa manis dan legit.\n" +
                    "\n" +
                    "Harum pisangnya juga sangat khas, sebab ia dibuat dari bahan dasar buah pisang yang matang. Kue ini juga dibungkus dengan daun pisang."



    };

    private static String [] foodPrice = {
            "10.000",
            "35.000",
            "5.000",
            "80.000",
            "30.000",
            "2.000",
            "1.000",
            "5.000",
            "10.000",
            "5.000"
    };
    private static int [] foodImage = {
            R.drawable.food1,
            R.drawable.food2,
            R.drawable.food3,
            R.drawable.food4,
            R.drawable.food5,
            R.drawable.food6,
            R.drawable.food7,
            R.drawable.food8,
            R.drawable.food9,
            R.drawable.food10,
    };

    private static String [] foodIngredient = {
            "Daging sapi, dan rempah yang khas\n",
            "Pisang, dan topping yang manis\n",
            "Beras ketan, abon atau serundeng dan daun pisang\n",
            "Iga sapi, bumbu kacang dan kuah sup kaldu yang khas\n",
            "Sagu, kacang, sayuran dan ikan\n",
            "Beras dan daun pisang.\n",
            "Ketan dan gula merah\n",
            "Wortel, tauge, soun atau bihun dan telur\n",
            "Pisang, pandan, santan dan sirup\n",
            "Pisang yang dimatangkan dan daun pisang"



    };

    private static float [] foodRating = {
            5f,
            4f,
            3f,
            4f,
            5f,
            5f,
            4f,
            3f,
            4f,
            5f,
    };

    public static ArrayList<Foods> getListData(){
        ArrayList<Foods> list = new ArrayList<>();
        for (int position = 0; position < foodTitle.length; position++){
            Foods foods   = new Foods();
            foods.setPrice(foodPrice[position]);
            foods.setName(foodTitle[position]);
            foods.setDetail(foodDetail[position]);
            foods.setPhoto(foodImage[position]);
            foods.setIngredient(foodIngredient[position]);
            foods.setRating(foodRating[position]);
            list.add(foods);
        }
        return list;
    }
}
