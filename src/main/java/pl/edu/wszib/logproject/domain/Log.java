package pl.edu.wszib.logproject.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryDate = new Date(); //data złoszenia, html

    @NotNull
    @Size(min = 2, max = 30)
    private String source; //żródło zgłoszenia, html

    @NotNull
    @Size(min = 2, max = 30)
    private String opType;//rodzaj operacji,html

    @NotNull
    @Size(min = 2, max = 500)
    private String description; //opis podjętych czynności, html

    @NotNull
    @Size(min = 2, max = 30)
    private String admin;//wykonawca, html,

    @Size(min = 2, max = 30)
    private String coAdmin;//współwykonawca, html

    @NotNull
    private String status;//określa realizacji zgłoszenia (pole wyboru)

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;//data zakończenia zgłoszenia

    public Log() {
    }


    public Log( Date entryDate,  @Size(min = 2, max = 30) String source,
                String opType,  @Size(min = 2, max = 30) String admin,
               @Size(min = 2, max = 30) String coAdmin,
                String status,  String description, Date endDate) {
        this.entryDate = entryDate;
        this.source = source;
        this.opType = opType;
        this.admin = admin;
        this.coAdmin = coAdmin;
        this.status = status;
        this.description = description;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
