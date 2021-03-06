package com.mx.nibble.domain;
// Generated Dec 19, 2014 6:33:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdPrinttableformat generated by hbm2java
 */
public class AdPrinttableformat  implements java.io.Serializable {


     private long adPrinttableformatId;
     private AdPrintcolor adPrintcolorByLinePrintcolorId;
     private AdPrintcolor adPrintcolorByHdrtextbgPrintcolorId;
     private AdImage adImage;
     private AdPrintfont adPrintfontByFunctPrintfontId;
     private AdPrintcolor adPrintcolorByHdrtextfgPrintcolorId;
     private AdPrintcolor adPrintcolorByFunctbgPrintcolorId;
     private AdPrintcolor adPrintcolorByFunctfgPrintcolorId;
     private AdPrintfont adPrintfontByHdrPrintfontId;
     private AdPrintcolor adPrintcolorByHdrlinePrintcolorId;
     private long adClientId;
     private long adOrgId;
     private char isactive;
     private Date created;
     private long createdby;
     private Date updated;
     private long updatedby;
     private String description;
     private char ispaintboundarylines;
     private char ispainthlines;
     private char ispaintvlines;
     private char isprintfunctionsymbols;
     private String name;
     private char isdefault;
     private String imageurl;
     private String headerleft;
     private String headercenter;
     private String headerright;
     private String footerleft;
     private String footercenter;
     private String footerright;
     private Character imageisattached;
     private BigDecimal hdrstroke;
     private BigDecimal linestroke;
     private Character hdrstroketype;
     private Character linestroketype;
     private char ispaintheaderlines;
     private char ismultilineheader;
     private Set adPrintformats = new HashSet(0);

    public AdPrinttableformat() {
    }

	
    public AdPrinttableformat(long adPrinttableformatId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, char ispaintboundarylines, char ispainthlines, char ispaintvlines, char isprintfunctionsymbols, String name, char isdefault, char ispaintheaderlines, char ismultilineheader) {
        this.adPrinttableformatId = adPrinttableformatId;
        this.adClientId = adClientId;
        this.adOrgId = adOrgId;
        this.isactive = isactive;
        this.created = created;
        this.createdby = createdby;
        this.updated = updated;
        this.updatedby = updatedby;
        this.ispaintboundarylines = ispaintboundarylines;
        this.ispainthlines = ispainthlines;
        this.ispaintvlines = ispaintvlines;
        this.isprintfunctionsymbols = isprintfunctionsymbols;
        this.name = name;
        this.isdefault = isdefault;
        this.ispaintheaderlines = ispaintheaderlines;
        this.ismultilineheader = ismultilineheader;
    }
    public AdPrinttableformat(long adPrinttableformatId, AdPrintcolor adPrintcolorByLinePrintcolorId, AdPrintcolor adPrintcolorByHdrtextbgPrintcolorId, AdImage adImage, AdPrintfont adPrintfontByFunctPrintfontId, AdPrintcolor adPrintcolorByHdrtextfgPrintcolorId, AdPrintcolor adPrintcolorByFunctbgPrintcolorId, AdPrintcolor adPrintcolorByFunctfgPrintcolorId, AdPrintfont adPrintfontByHdrPrintfontId, AdPrintcolor adPrintcolorByHdrlinePrintcolorId, long adClientId, long adOrgId, char isactive, Date created, long createdby, Date updated, long updatedby, String description, char ispaintboundarylines, char ispainthlines, char ispaintvlines, char isprintfunctionsymbols, String name, char isdefault, String imageurl, String headerleft, String headercenter, String headerright, String footerleft, String footercenter, String footerright, Character imageisattached, BigDecimal hdrstroke, BigDecimal linestroke, Character hdrstroketype, Character linestroketype, char ispaintheaderlines, char ismultilineheader, Set adPrintformats) {
       this.adPrinttableformatId = adPrinttableformatId;
       this.adPrintcolorByLinePrintcolorId = adPrintcolorByLinePrintcolorId;
       this.adPrintcolorByHdrtextbgPrintcolorId = adPrintcolorByHdrtextbgPrintcolorId;
       this.adImage = adImage;
       this.adPrintfontByFunctPrintfontId = adPrintfontByFunctPrintfontId;
       this.adPrintcolorByHdrtextfgPrintcolorId = adPrintcolorByHdrtextfgPrintcolorId;
       this.adPrintcolorByFunctbgPrintcolorId = adPrintcolorByFunctbgPrintcolorId;
       this.adPrintcolorByFunctfgPrintcolorId = adPrintcolorByFunctfgPrintcolorId;
       this.adPrintfontByHdrPrintfontId = adPrintfontByHdrPrintfontId;
       this.adPrintcolorByHdrlinePrintcolorId = adPrintcolorByHdrlinePrintcolorId;
       this.adClientId = adClientId;
       this.adOrgId = adOrgId;
       this.isactive = isactive;
       this.created = created;
       this.createdby = createdby;
       this.updated = updated;
       this.updatedby = updatedby;
       this.description = description;
       this.ispaintboundarylines = ispaintboundarylines;
       this.ispainthlines = ispainthlines;
       this.ispaintvlines = ispaintvlines;
       this.isprintfunctionsymbols = isprintfunctionsymbols;
       this.name = name;
       this.isdefault = isdefault;
       this.imageurl = imageurl;
       this.headerleft = headerleft;
       this.headercenter = headercenter;
       this.headerright = headerright;
       this.footerleft = footerleft;
       this.footercenter = footercenter;
       this.footerright = footerright;
       this.imageisattached = imageisattached;
       this.hdrstroke = hdrstroke;
       this.linestroke = linestroke;
       this.hdrstroketype = hdrstroketype;
       this.linestroketype = linestroketype;
       this.ispaintheaderlines = ispaintheaderlines;
       this.ismultilineheader = ismultilineheader;
       this.adPrintformats = adPrintformats;
    }
   
    public long getAdPrinttableformatId() {
        return this.adPrinttableformatId;
    }
    
    public void setAdPrinttableformatId(long adPrinttableformatId) {
        this.adPrinttableformatId = adPrinttableformatId;
    }
    public AdPrintcolor getAdPrintcolorByLinePrintcolorId() {
        return this.adPrintcolorByLinePrintcolorId;
    }
    
    public void setAdPrintcolorByLinePrintcolorId(AdPrintcolor adPrintcolorByLinePrintcolorId) {
        this.adPrintcolorByLinePrintcolorId = adPrintcolorByLinePrintcolorId;
    }
    public AdPrintcolor getAdPrintcolorByHdrtextbgPrintcolorId() {
        return this.adPrintcolorByHdrtextbgPrintcolorId;
    }
    
    public void setAdPrintcolorByHdrtextbgPrintcolorId(AdPrintcolor adPrintcolorByHdrtextbgPrintcolorId) {
        this.adPrintcolorByHdrtextbgPrintcolorId = adPrintcolorByHdrtextbgPrintcolorId;
    }
    public AdImage getAdImage() {
        return this.adImage;
    }
    
    public void setAdImage(AdImage adImage) {
        this.adImage = adImage;
    }
    public AdPrintfont getAdPrintfontByFunctPrintfontId() {
        return this.adPrintfontByFunctPrintfontId;
    }
    
    public void setAdPrintfontByFunctPrintfontId(AdPrintfont adPrintfontByFunctPrintfontId) {
        this.adPrintfontByFunctPrintfontId = adPrintfontByFunctPrintfontId;
    }
    public AdPrintcolor getAdPrintcolorByHdrtextfgPrintcolorId() {
        return this.adPrintcolorByHdrtextfgPrintcolorId;
    }
    
    public void setAdPrintcolorByHdrtextfgPrintcolorId(AdPrintcolor adPrintcolorByHdrtextfgPrintcolorId) {
        this.adPrintcolorByHdrtextfgPrintcolorId = adPrintcolorByHdrtextfgPrintcolorId;
    }
    public AdPrintcolor getAdPrintcolorByFunctbgPrintcolorId() {
        return this.adPrintcolorByFunctbgPrintcolorId;
    }
    
    public void setAdPrintcolorByFunctbgPrintcolorId(AdPrintcolor adPrintcolorByFunctbgPrintcolorId) {
        this.adPrintcolorByFunctbgPrintcolorId = adPrintcolorByFunctbgPrintcolorId;
    }
    public AdPrintcolor getAdPrintcolorByFunctfgPrintcolorId() {
        return this.adPrintcolorByFunctfgPrintcolorId;
    }
    
    public void setAdPrintcolorByFunctfgPrintcolorId(AdPrintcolor adPrintcolorByFunctfgPrintcolorId) {
        this.adPrintcolorByFunctfgPrintcolorId = adPrintcolorByFunctfgPrintcolorId;
    }
    public AdPrintfont getAdPrintfontByHdrPrintfontId() {
        return this.adPrintfontByHdrPrintfontId;
    }
    
    public void setAdPrintfontByHdrPrintfontId(AdPrintfont adPrintfontByHdrPrintfontId) {
        this.adPrintfontByHdrPrintfontId = adPrintfontByHdrPrintfontId;
    }
    public AdPrintcolor getAdPrintcolorByHdrlinePrintcolorId() {
        return this.adPrintcolorByHdrlinePrintcolorId;
    }
    
    public void setAdPrintcolorByHdrlinePrintcolorId(AdPrintcolor adPrintcolorByHdrlinePrintcolorId) {
        this.adPrintcolorByHdrlinePrintcolorId = adPrintcolorByHdrlinePrintcolorId;
    }
    public long getAdClientId() {
        return this.adClientId;
    }
    
    public void setAdClientId(long adClientId) {
        this.adClientId = adClientId;
    }
    public long getAdOrgId() {
        return this.adOrgId;
    }
    
    public void setAdOrgId(long adOrgId) {
        this.adOrgId = adOrgId;
    }
    public char getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(char isactive) {
        this.isactive = isactive;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public long getCreatedby() {
        return this.createdby;
    }
    
    public void setCreatedby(long createdby) {
        this.createdby = createdby;
    }
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public long getUpdatedby() {
        return this.updatedby;
    }
    
    public void setUpdatedby(long updatedby) {
        this.updatedby = updatedby;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public char getIspaintboundarylines() {
        return this.ispaintboundarylines;
    }
    
    public void setIspaintboundarylines(char ispaintboundarylines) {
        this.ispaintboundarylines = ispaintboundarylines;
    }
    public char getIspainthlines() {
        return this.ispainthlines;
    }
    
    public void setIspainthlines(char ispainthlines) {
        this.ispainthlines = ispainthlines;
    }
    public char getIspaintvlines() {
        return this.ispaintvlines;
    }
    
    public void setIspaintvlines(char ispaintvlines) {
        this.ispaintvlines = ispaintvlines;
    }
    public char getIsprintfunctionsymbols() {
        return this.isprintfunctionsymbols;
    }
    
    public void setIsprintfunctionsymbols(char isprintfunctionsymbols) {
        this.isprintfunctionsymbols = isprintfunctionsymbols;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public char getIsdefault() {
        return this.isdefault;
    }
    
    public void setIsdefault(char isdefault) {
        this.isdefault = isdefault;
    }
    public String getImageurl() {
        return this.imageurl;
    }
    
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
    public String getHeaderleft() {
        return this.headerleft;
    }
    
    public void setHeaderleft(String headerleft) {
        this.headerleft = headerleft;
    }
    public String getHeadercenter() {
        return this.headercenter;
    }
    
    public void setHeadercenter(String headercenter) {
        this.headercenter = headercenter;
    }
    public String getHeaderright() {
        return this.headerright;
    }
    
    public void setHeaderright(String headerright) {
        this.headerright = headerright;
    }
    public String getFooterleft() {
        return this.footerleft;
    }
    
    public void setFooterleft(String footerleft) {
        this.footerleft = footerleft;
    }
    public String getFootercenter() {
        return this.footercenter;
    }
    
    public void setFootercenter(String footercenter) {
        this.footercenter = footercenter;
    }
    public String getFooterright() {
        return this.footerright;
    }
    
    public void setFooterright(String footerright) {
        this.footerright = footerright;
    }
    public Character getImageisattached() {
        return this.imageisattached;
    }
    
    public void setImageisattached(Character imageisattached) {
        this.imageisattached = imageisattached;
    }
    public BigDecimal getHdrstroke() {
        return this.hdrstroke;
    }
    
    public void setHdrstroke(BigDecimal hdrstroke) {
        this.hdrstroke = hdrstroke;
    }
    public BigDecimal getLinestroke() {
        return this.linestroke;
    }
    
    public void setLinestroke(BigDecimal linestroke) {
        this.linestroke = linestroke;
    }
    public Character getHdrstroketype() {
        return this.hdrstroketype;
    }
    
    public void setHdrstroketype(Character hdrstroketype) {
        this.hdrstroketype = hdrstroketype;
    }
    public Character getLinestroketype() {
        return this.linestroketype;
    }
    
    public void setLinestroketype(Character linestroketype) {
        this.linestroketype = linestroketype;
    }
    public char getIspaintheaderlines() {
        return this.ispaintheaderlines;
    }
    
    public void setIspaintheaderlines(char ispaintheaderlines) {
        this.ispaintheaderlines = ispaintheaderlines;
    }
    public char getIsmultilineheader() {
        return this.ismultilineheader;
    }
    
    public void setIsmultilineheader(char ismultilineheader) {
        this.ismultilineheader = ismultilineheader;
    }
    public Set getAdPrintformats() {
        return this.adPrintformats;
    }
    
    public void setAdPrintformats(Set adPrintformats) {
        this.adPrintformats = adPrintformats;
    }




}


