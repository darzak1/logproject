package pl.edu.wszib.logproject.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;




@Entity
@Table(name = "Forms")// tu nie tabela ale formularz ma być
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    private Date entryDate;//data wprowadzenia zgłoszenia
    @NotNull
    @Size(min = 2, max = 30)
    private String source;//określenie żródła zdarzenia
    @NotNull
    private String opType;//rodzaj operacji
    @NotNull
    @Size(min = 2, max = 30)
    private String admin;//wykonawca
    @Size(min = 2, max = 30)
    private String coAdmin;//współwykonawca
    @NotNull
    private String description;//opis podjętych czynności
    @NotNull
    private String status;//określa realizacji zgłoszenia (pole wyboru)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;//data zakończenia zgłoszenia


    public Form() {
    }

    public Form(@NotNull Date entryDate, @NotNull @Size(min = 2, max = 30) String source,
                @NotNull String opType, @NotNull @Size(min = 2, max = 30) String admin,
                @Size(min = 2, max = 30) String coAdmin,
                @NotNull String description, @NotNull String status, Date endDate) {
        this.entryDate = entryDate;
        this.source = source;
        this.opType = opType;
        this.admin = admin;
        this.coAdmin = coAdmin;
        this.description = description;
        this.status = status;
        this.endDate = endDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}