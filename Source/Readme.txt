**************************
*  Android App Policamp  *
**************************


******* PROXY POLICAMP *********

**/ Para adicionar o proxy e remover

git config --global http.proxy 10.0.0.1:3128
git config --global http.sslverify false
**
git config --global --unset http.proxy
git config --global --unset http.sslverify

*** Comando de utiliza��o do git ***

**/ Configurar o Repositorio
git remote add origin https://github.com/raff4/androidapp.git

**/ Comitar c�digo com comentario
git commit -am "Comentario do Commit"

**/ Efetivar o commit no repositorio
git push -u  origin master

**/ Clonar o repositorio para m�quina
git clone /caminho/para/o/reposit�rio

**/ para atualizar seu reposit�rio local com a mais nova vers�o, execute 
git pull

**/ Rotular Release de Software
git tag 1.0.0


Fonte
http://rogerdudler.github.io/git-guide/index.pt_BR.html


