
package org.springframework.samples.petclinic.owner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.core.style.ToStringCreator;


@Entity
@Table(name = "owners")
public class Owners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docId")
    @NotFound(action = NotFoundAction.IGNORE)
    private Integer docId;

    @Column(name = "doc_name")
    @NotFound(action = NotFoundAction.IGNORE)
    private String docName;

    @Column(name = "owner")
    @NotFound(action = NotFoundAction.IGNORE)
    private String owner;

    @Column(name = "path")
    @NotFound(action = NotFoundAction.IGNORE)
    private String path;

    @Column(name = "userId")
    @NotFound(action = NotFoundAction.IGNORE)
    private Integer userId;

    public Owners(){
        
    }

    public Owners(int docId, String docName, String owner, String path, int userId){
 this.docId=docId;
 this.docName=docName;
 this.owner=owner;
 this.path=path;
 this.userId=userId;
    }

    public Integer getuserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public boolean isNew() {
        return this.docId == null;
    }

    public String getdocName() {
        return this.docName;
    }

    public void setdocName(String docName) {
        this.docName = docName;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getDocId() {
        return this.docId;
    }

    public void setTelephone(Integer docId) {
        this.docId=docId;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)

                .append("doc id", this.getDocId())
                .append("new", this.isNew())
                .append("doc Name", this.getdocName())
                .append("Owner", this.getOwner())
                .append("Path:", this.path)
                .append("Owner Id", this.userId).toString();
    }
}
