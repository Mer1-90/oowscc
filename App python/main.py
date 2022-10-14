# Contents of ~/my_app/main_page.py
import numpy as np
import pandas as pd
import streamlit as st

#import networkx


col1, col2 = st.columns(2)




#st.image("./images/modis-adecco-group.jpg", use_column_width=True)

st.markdown("# App To ...")
st.sidebar.markdown("# Journal")

st.sidebar.markdown("## Paramètres de l\'utilisateur")

cout_min = st.sidebar.number_input('Coût min', value= 50)

cout_max = st.sidebar.number_input('Coût max', value= 99)

temps_limit = st.sidebar.number_input('Temps limit', value= 100)

st.sidebar.markdown("## Paramètres QoS")

fiabilite = st.sidebar.slider('Fiabilité', min_value=0, max_value=100, step= 1, value= 10)

disponibile = st.sidebar.slider('Disponibilé', min_value=0, max_value=100, step= 1, value= 10)

cout = st.sidebar.slider('Coût', min_value=0, max_value=100, step= 1, value= 50)

securite = st.sidebar.slider('Securité', min_value=0, max_value=100, step= 1, value= 10)

temps_reponse = st.sidebar.slider('Temps de réponse', min_value=0, max_value=100, step= 1, value= 10)

consommation_energie = st.sidebar.slider('Consommation d\'énergie', min_value=0, max_value=100, step= 1, value= 10)



values = st.slider(
    'Select a range of values',
    0.0, 100.0, (25.0, 75.0))
st.write('Values:', values)

col1, col2 = st.columns([5, 5])

with col1:
   st.write('Génération des parametres du workflow')

   df_workflow = pd.DataFrame(
      np.random.randn(10, 3),
      columns=('col %d' % i for i in range(3)))

   st.table(df_workflow)

with col2:
   st.write('Simulation des parametres de l\'environnement cloud')
   df_cloud = pd.DataFrame(
      np.random.randn(10, 4),
      columns=('col %d' % i for i in range(4)))

   st.table(df_cloud)



