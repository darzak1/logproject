package pl.edu.wszib.logproject.domain;

import javax.persistence.*;

@Entity
@Table(name = "selected_action")
public class SelectedAction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String addEntry;
    private String search;
    private String stats;

    public SelectedAction() {
    }

    public SelectedAction(String addEntry, String search, String stats) {
        this.addEntry = addEntry;
        this.search = search;
        this.stats = stats;
    }

    public String getAddEntry() {
        return addEntry;
    }

    public void setAddEntry(String addEntry) {
        this.addEntry = addEntry;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }
}
