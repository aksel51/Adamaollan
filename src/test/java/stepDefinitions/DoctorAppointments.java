package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utulities.ConfigReader;
import utulities.Driver;

public class DoctorAppointments {

    @Given("doktor medunna anasayfasına gider")
    public void doktor_medunna_anasayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }

    @When("doktor signin sekmesine tıklar")
    public void doktor_signin_sekmesine_tıklar() {

    }
    @When("doktor geçerli usarnameyi girer")
    public void doktor_geçerli_usarnameyi_girer() {

    }
    @When("doktor geçerli passwordu girer")
    public void doktor_geçerli_passwordu_girer() {

    }
    @When("doktor sign butonuna tıklar")
    public void doktor_sign_butonuna_tıklar() {

    }
    @When("doktor my pages sekmesine tiklar")
    public void doktor_my_pages_sekmesine_tiklar() {

    }
    @When("doktor my appointments sekmesine tiklar")
    public void doktor_my_appointments_sekmesine_tiklar() {

    }
    @When("doktor randevularinda Edit butonuna tiklar")
    public void doktor_randevularinda_edit_butonuna_tiklar() {

    }
    @When("doktor anemnesis, treatment, diagnosis bolumlerini doldurur")
    public void doktor_anemnesis_treatment_diagnosis_bolumlerini_doldurur() {
        ;
    }
    @When("doktor Save butonuna tiklar")
    public void doktor_save_butonuna_tiklar() {

    }
    @Then("Doktor {string} mesajini gorunur oldugunu dogrular")
    public void doktor_mesajini_gorunur_oldugunu_dogrular(String string) {

    }
    @Then("doktor sayfayi kapatir")
    public void doktor_sayfayi_kapatir() {
    }


    @Then("doktor randevularina ait {string} gorunur oldugunu dogrular")
    public void doktorRandevularinaAitGorunurOldugunuDogrular(String arg0) {
    }

    @And("doktor anemnesis, treatment, diagnosis bolumlerini bos birakir")
    public void doktorAnemnesisTreatmentDiagnosisBolumleriniBosBirakir() {
    }

    @Then("Doktor {string} mesajinin gorunur oldugunu dogrular")
    public void doktorMesajininGorunurOldugunuDogrular(String arg0) {
    }

    @And("doktor prescription ve description bolumleri haric bolumleri doldurur")
    public void doktorPrescriptionVeDescriptionBolumleriHaricBolumleriDoldurur() {
    }

    @And("doktor status bolumunu {string} olarak secer")
    public void doktorStatusBolumunuOlarakSecer(String arg0) {
    }
}
