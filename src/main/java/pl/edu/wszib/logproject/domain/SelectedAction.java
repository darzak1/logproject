package pl.edu.wszib.logproject.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "new_entry")// tu nie tabela ale formularz ma być
public class SelectedAction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date entryDate;//data wprowadzenia zgłoszenia
    private String source;//określenie żródła zdarzenia
    private String opType;//rodzaj operacji
    private String admin;//wykonawca
    private String coAdmin;//współwykonawca
    private String descript;//opis podjętych czynności
    private String result;//określa czy zdarzenie zostało rozwiązane (tak, nie)
    private Date endDate;//data zakończenia zgłoszenia


    public SelectedAction() {
    }

    public SelectedAction(Date entryDate, Date endDate) {
        this.entryDate = entryDate;
        this.source = source;
        this.opType = opType;
        this.admin = admin;
        this.coAdmin = coAdmin;
        this.descript = descript;
        this.result = result;
        this.endDate = endDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getCoAdmin() {
        return coAdmin;
    }

    public void setCoAdmin(String coAdmin) {
        this.coAdmin = coAdmin;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
