/*
package com.iu.teschner.geisternetze.loader;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.iu.teschner.geisternetze.model.Netz;
import com.iu.teschner.geisternetze.repository.NetzRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private NetzRepository netzRepository;

    @Override
    public void run(String... args) throws Exception {
        loadNetzData();
    }

    private void loadNetzData() {
        if (netzRepository.count() == 0) {
            Netz netz1 = new Netz();
            netz1.setKoordinaten("52.5200° N, 13.4050° E");
            netz1.setStatus("Aktiv");

            Netz netz2 = new Netz();
            netz2.setKoordinaten("48.8566° N, 2.3522° E");
            netz2.setStatus("Inaktiv");

            Netz netz3 = new Netz();
            netz3.setKoordinaten("40.7128° N, 74.0060° W");
            netz3.setStatus("Aktiv");

            netzRepository.save(netz1);
            netzRepository.save(netz2);
            netzRepository.save(netz3);
        }
    }
}

*/