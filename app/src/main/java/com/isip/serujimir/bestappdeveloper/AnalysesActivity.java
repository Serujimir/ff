package com.isip.serujimir.bestappdeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.isip.serujimir.bestappdeveloper.adapters.CatalogAdapter;
import com.isip.serujimir.bestappdeveloper.adapters.CatalogListAdapter;
import com.isip.serujimir.bestappdeveloper.adapters.NewsAdapter;
import com.isip.serujimir.bestappdeveloper.bodies.Catalog;
import com.isip.serujimir.bestappdeveloper.bodies.CatalogList;
import com.isip.serujimir.bestappdeveloper.bodies.News;

import java.util.ArrayList;

public class AnalysesActivity extends AppCompatActivity {

    RecyclerView rvNews, rvCatalog, rvCatalogList;
    ArrayList<News> newsArrayList;
    ArrayList<Catalog> catalogArrayList;
    ArrayList<CatalogList> catalogListArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyses);
        init();
    }

    public void init() {
        rvCatalog = findViewById(R.id.rvCatalog);
        rvNews = findViewById(R.id.rvNews);
        rvCatalogList = findViewById(R.id.rcCatalogList);

        newsArrayList = new ArrayList<>();
        newsArrayList.add(new News("Чек-ап для мужчин", "9 исследований", "8000 ₽", getDrawable(R.drawable.image)));
        newsArrayList.add(new News("Подготовка к вакцинации", "Комплексное обследование перед вакцинацией", "4000 ₽", getDrawable(R.drawable.image)));

        catalogArrayList = new ArrayList<>();
        catalogArrayList.add(new Catalog("Популярные"));
        catalogArrayList.add(new Catalog("Covid"));
        catalogArrayList.add(new Catalog("Комплексные"));

        catalogListArrayList = new ArrayList<>();
        catalogListArrayList.add(new CatalogList("ПЦР-тест на определение РНК коронавируса стандартный", "2 дня", "1800 ₽"));
        catalogListArrayList.add(new CatalogList("Клинический анализ крови с лейкоцитарной формулировкой", "1 день", "1800 ₽"));
        catalogListArrayList.add(new CatalogList("ПЦР-тест на определение РНК коронавируса стандартный", "2 дня", "1800 ₽"));

        NewsAdapter newsAdapter = new NewsAdapter(this, newsArrayList);
        rvNews.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvNews.setAdapter(newsAdapter);

        CatalogAdapter catalogAdapter = new CatalogAdapter(this, catalogArrayList);
        rvCatalog.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvCatalog.setAdapter(catalogAdapter);

        CatalogListAdapter catalogListAdapter = new CatalogListAdapter(this, catalogListArrayList);
        rvCatalogList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvCatalogList.setAdapter(catalogListAdapter);

    }
}