package com.example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "koichan_message")
public class KoichanMessage {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "koichan_id")
    private long koichan_id;

    @Column(name = "koichan_message_type")
    private String koichan_message_type;

    @Column(name = "koichan_message")
    private String koichan_message;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getKoichanId() {
        return koichan_id;
    }
    public void setKoichanId(long koichan_id) {
        this.koichan_id = koichan_id;
    }

    public String getKoichanMessageType() {
        return koichan_message_type;
    }
    public void setKoichanMessageType(String koichan_message_type) {
        this.koichan_message_type = koichan_message_type;
    }

    public String getKoichanMessage() {
        return koichan_message;
    }
    public void setKoichanMessage(String koichan_message) {
        this.koichan_message = koichan_message;
    }
}