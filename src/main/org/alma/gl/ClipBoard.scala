package org.alma.gl

/**
 * Presse papier
 * @author E120404Z
 */
class ClipBoard  {
 private var contenu : String = ""
 
 def getContenu() : String={
   return contenu
 }
 
 def setContenu(s: String) : Unit={
   contenu = s
 }
}