# ACAD
Projeto ERP para a empresa Academia da Estratégia

#Projeto eva-web
Para que as folhas de estilo sejam carregadas corretamente, temos que copiar a pasta "resources" dentro de 
${PROJECT_HOME}/Eva/eva-build/eva-web/src/main/webapp para a pasta ${GLASSFISH_HOME}/glassfish/domains/domain1/docroot/evastatic

#Banco de dados
Para que as aplicações business sejam executadas corretamente é necessário configurar um non-jta-datasource no servidor de aplicação com o nome "eva"
